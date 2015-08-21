package org.pearl.mobilepearl.domain.dto;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.pearl.mobilepearl.domain.Product;

public class ShoppingCart implements Serializable {

	private static final long serialVersionUID = 5641540300387968631L;
	private Map<Product, Integer> products = new HashMap<Product, Integer>();

	public ShoppingCart() {
	}

	public void clear() {
		this.products.clear();
	}

	public void addProduct(Product p) {
		for (Product product : this.products.keySet()) {
			if (product.getId().equals(p.getId())) {
				this.products.put(product, this.products.get(product) + 1);
				return;
			}
		}
		this.products.put(p, 1);
	}

	public void removeProduct(Product p) {
		for (Product product : this.products.keySet()){
			if (product.getId().equals(p.getId())){
				this.products.remove(product);
				return;
			}
		}
	}

	public Map<Product, Integer> getProducts() {
		return Collections.unmodifiableMap(products);
	}
}
