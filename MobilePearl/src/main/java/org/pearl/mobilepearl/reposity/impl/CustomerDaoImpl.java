package org.pearl.mobilepearl.reposity.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pearl.mobilepearl.domain.Customer;
import org.pearl.mobilepearl.reposity.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Customer customer) {
		this.getSession().save(customer);
	}

}
