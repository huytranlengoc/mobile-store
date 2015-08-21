package org.pearl.mobilepearl.service.impl;

import java.util.List;
import org.pearl.mobilepearl.domain.Category;
import org.pearl.mobilepearl.domain.DetailProduct;
import org.pearl.mobilepearl.domain.Product;
import org.pearl.mobilepearl.domain.dto.MobileSearchCriteria;
import org.pearl.mobilepearl.reposity.CategoryDao;
import org.pearl.mobilepearl.reposity.ProductDao;
import org.pearl.mobilepearl.service.MobileStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MobileStoreServiceImpl implements MobileStoreService {
	@Autowired
	private CategoryDao categoryDAO;
	
	@Autowired
	private ProductDao productDAO;
	
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
