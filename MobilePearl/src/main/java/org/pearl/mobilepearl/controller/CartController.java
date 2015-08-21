package org.pearl.mobilepearl.controller;

import org.pearl.mobilepearl.domain.Product;
import org.pearl.mobilepearl.domain.dto.ShoppingCart;
import org.pearl.mobilepearl.service.MobileStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	
	@Autowired
	private ShoppingCart cart;

	@Autowired
	private MobileStoreService mobileStoreService;

	@RequestMapping("/cart/add/{productId}")
	public String addToCart(@PathVariable("productId") Integer productId,
			@RequestHeader("referer") String referer) {
		Product p = this.mobileStoreService.findProduct(productId);
		this.cart.addProduct(p);
		return "redirect:" + referer;
	}

	@RequestMapping("/cart/del/{productId}")
	public String delProductCart(@PathVariable("productId") Integer productId, ModelMap model) {
		Product p = this.mobileStoreService.findProduct(productId);
		this.cart.removeProduct(p);
		model.addAttribute("cart", this.cart);
		return "cart/checkout";
	}

	@RequestMapping("/cart/delAll")
	public String delProductCart(ModelMap model) {
		this.cart.clear();
		model.addAttribute("cart", this.cart);
		return "cart/checkout";
	}
}
