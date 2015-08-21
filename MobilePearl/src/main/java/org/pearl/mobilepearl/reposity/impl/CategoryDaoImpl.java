package org.pearl.mobilepearl.reposity.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pearl.mobilepearl.domain.Category;
import org.pearl.mobilepearl.reposity.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings(value="unchecked")
	@Override
	public List<Category> getAllCateogories() {
		return this.getSession().createQuery("from "+Category.class.getName()+" order by sort_order asc").list();
	}

}
