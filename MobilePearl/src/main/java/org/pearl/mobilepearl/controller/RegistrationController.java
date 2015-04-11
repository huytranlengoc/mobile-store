package org.pearl.mobilepearl.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.pearl.mobilepearl.domain.POJO.CustomerRegistration;
import org.pearl.mobilepearl.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/customer/register")
public class RegistrationController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String register(ModelMap model) {
		model.addAttribute("customerRegistration", new CustomerRegistration());
		return "customer/register";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleRegistration(@Valid @ModelAttribute CustomerRegistration customerRegistration,
			BindingResult result, HttpSession session, RedirectAttributes redirect) {
		if (result.hasErrors()) return "customer/register";
		if (!customerRegistration.getConfirmPassword().equals(customerRegistration.getPassword())){
			redirect.addFlashAttribute("notmatch", "The confirm password not match");
			return "customer/register";
		}
		session.setAttribute("account", this.customerService.addCustomer(customerRegistration));
		return "redirect:/index";
	}
}
