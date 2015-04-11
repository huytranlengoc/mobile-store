package org.pearl.mobilepearl.controller;

import org.pearl.mobilepearl.service.MobileStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MobileDetailController {
	@Autowired
	private MobileStoreService mobileStoreService;
	
	@RequestMapping(value="/mobile/detail/{productId}")
	public String details(@PathVariable("productId") Integer productId, ModelMap model){
		model.addAttribute("product",this.mobileStoreService.findProduct(productId));
		model.addAttribute("detail", this.mobileStoreService.findDetailProduct(productId));
		return "mobile/detail";
	}
}
