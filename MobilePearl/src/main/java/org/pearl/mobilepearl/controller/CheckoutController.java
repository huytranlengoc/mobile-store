package org.pearl.mobilepearl.controller;

import org.pearl.mobilepearl.domain.POJO.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart/checkout")
public class CheckoutController {
	@Autowired
	private ShoppingCart cart;
	
	@RequestMapping(method=RequestMethod.GET)
	public String show(ModelMap model){
		model.addAttribute("cart", this.cart);
		return "cart/checkout";
	}
}
