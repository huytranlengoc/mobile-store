package org.pearl.mobilepearl.reposity.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pearl.mobilepearl.domain.DetailProduct;
import org.pearl.mobilepearl.domain.Product;
import org.pearl.mobilepearl.domain.dto.MobileSearchCriteria;
import org.pearl.mobilepearl.reposity.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProducts() {
		return this.getSession().createQuery("from " + Product.class.getName())
				.list();
	}
	
	@Override
	public Product findProduct(Integer productId){
		return (Product) this.getSession().createQuery("from "+Product.class.getName()+" where id = :id")
				.setInteger("id", productId).uniqueResult();
	}
	
	@Override
	public DetailProduct findDetailProduct(Integer productId) {
		return (DetailProduct) this.getSession().createQuery("from "+DetailProduct.class.getName()+" where id = :id")
				.setInteger("id", productId).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findProducts(MobileSearchCriteria criteria) {
		String hql = "from " + Product.class.getName();
		Query query = null;
		String name = criteria.getName();
		System.out.println(criteria.getName());
		if (name != null && !name.trim().equals("")){
			hql += " where name like :name";
			query = this.getSession().createQuery(hql).setString("name", "%" + name + "%");
		} else query = this.getSession().createQuery(hql);
		return query.list();
	}
}
