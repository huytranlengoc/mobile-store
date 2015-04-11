package org.pearl.mobilepearl.controller;

import java.util.List;

import org.pearl.mobilepearl.domain.Category;
import org.pearl.mobilepearl.domain.Product;
import org.pearl.mobilepearl.domain.POJO.MobileSearchCriteria;
import org.pearl.mobilepearl.service.MobileStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MobileSearchController {
	@Autowired
	private MobileStoreService mobileStoreService;

	@ModelAttribute("mobileSearchCriteria")
	public MobileSearchCriteria criteria() {
		return new MobileSearchCriteria();
	}
	
	@ModelAttribute("categories")
	public List<Category> categories(){
		return this.mobileStoreService.getAllCategories();
	}
	
	@ModelAttribute("products")
	@RequestMapping(value = "/mobile/search", method = RequestMethod.GET)
	public List<Product> list(
			@ModelAttribute("mobileSearchCriteria") MobileSearchCriteria criteria) {
		return this.mobileStoreService.findProducts(criteria);
	}
}
