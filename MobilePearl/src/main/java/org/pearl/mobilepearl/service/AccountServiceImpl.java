package org.pearl.mobilepearl.service;

import java.util.List;
import org.pearl.mobilepearl.domain.Account;
import org.pearl.mobilepearl.reposity.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDAO accountDAO;

	@Override
	public List<Account> getList() {
		return accountDAO.getList();
	}

	@Override
	public Account login(String username, String password) {
		Account acc = this.accountDAO.getAccount(username);
		if (acc != null){
			if (acc.getPassword().equals(password)){
				return acc;
			}
		}
		return null;
	}

	@Override
	public void save(Account account) {
		this.accountDAO.save(account);
	}
}
