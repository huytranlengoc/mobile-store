package org.pearl.mobilepearl.reposity;

import java.util.List;

import org.pearl.mobilepearl.domain.DetailProduct;
import org.pearl.mobilepearl.domain.Product;
import org.pearl.mobilepearl.domain.dto.MobileSearchCriteria;

public interface ProductDao {
	public List<Product> getProducts();
	public List<Product> findProducts(MobileSearchCriteria criteria);
	public Product findProduct(Integer productId);
	public DetailProduct findDetailProduct(Integer productId);
}
