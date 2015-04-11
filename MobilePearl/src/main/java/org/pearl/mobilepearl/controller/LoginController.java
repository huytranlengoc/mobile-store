package org.pearl.mobilepearl.controller;

import javax.servlet.http.HttpSession;

import org.pearl.mobilepearl.domain.Account;
import org.pearl.mobilepearl.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/login") 
public class LoginController {
	@Autowired
	private AccountService accService;

	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleLogin(@RequestParam String username,
			@RequestParam String password, HttpSession session,
			RedirectAttributes redirect) {
		Account acc = this.accService.login(username, password);
		if (acc != null) {
			session.setAttribute("account", acc);
			return "redirect:/index";
		} else {
			redirect.addFlashAttribute("error",
					"Invalid username/password. Try again!");
			return "redirect:/login";
		}
	}
}
