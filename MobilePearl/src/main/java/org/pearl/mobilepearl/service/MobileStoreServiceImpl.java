package org.pearl.mobilepearl.service;

import java.util.List;

import org.pearl.mobilepearl.domain.Category;
import org.pearl.mobilepearl.domain.DetailProduct;
import org.pearl.mobilepearl.domain.Product;
import org.pearl.mobilepearl.domain.POJO.MobileSearchCriteria;
import org.pearl.mobilepearl.reposity.CategoryDAO;
import org.pearl.mobilepearl.reposity.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MobileStoreServiceImpl implements MobileStoreService {
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public List<Category> getAllCategories() {
		return this.categoryDAO.getAllCateogories();
	}

	@Override
	public List<Product> getAllProduct() {
		return this.productDAO.getProducts();
	}

	@Override
	public List<Product> findProducts(MobileSearchCriteria criteria) {
		return this.productDAO.findProducts(criteria);
	}

	@Override
	public Product findProduct(Integer productId) {
		return this.productDAO.findProduct(productId);
	}

	@Override
	public DetailProduct findDetailProduct(Integer productId) {
		return this.productDAO.findDetailProduct(productId);
	}
	
}
