package org.pearl.mobilepearl.reposity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pearl.mobilepearl.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public Account getAccount(String username) {
		Query query = getSession().createQuery(
				"select a from " + Account.class.getName() + " a "
						+ "where a.username= :username ");
		List<Account> accounts = query.setParameter("username", username)
				.list();
		return accounts.size() == 1 ? accounts.get(0) : null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getList() {
		return getSession().createQuery("from Account").list();
	}

	@Override
	public void save(Account account) {
	   this.getSession().save(account);
	}
}
