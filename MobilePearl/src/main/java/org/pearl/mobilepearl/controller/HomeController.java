package org.pearl.mobilepearl.controller;

import java.util.List;

import org.pearl.mobilepearl.domain.Category;
import org.pearl.mobilepearl.domain.Product;
import org.pearl.mobilepearl.service.AccountService;
import org.pearl.mobilepearl.service.MobileStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class HomeController {
	@Autowired
	private AccountService accService;
	@Autowired
	private MobileStoreService mobileStoreService;
	
	@ModelAttribute("categories")
	public List<Category> getCategories(){
		return this.mobileStoreService.getAllCategories();
	}
	
	@ModelAttribute("products")
	public List<Product> getProducts(){
		return this.mobileStoreService.getAllProduct();
	}
	
	@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = {"/list"}, method = RequestMethod.GET)
	public String list(ModelMap model) {
		model.addAttribute("listAccount", this.accService.getList());
		return "list";
	}
}
