package org.pearl.mobilepearl.service;

import java.util.List;

import org.pearl.mobilepearl.domain.Category;
import org.pearl.mobilepearl.domain.DetailProduct;
import org.pearl.mobilepearl.domain.Product;
import org.pearl.mobilepearl.domain.POJO.MobileSearchCriteria;

public interface MobileStoreService {
	public List<Category> getAllCategories();
	public List<Product> getAllProduct();
	public List<Product> findProducts(MobileSearchCriteria criteria);
	public Product findProduct(Integer productId);
	public DetailProduct findDetailProduct(Integer productId);
}
