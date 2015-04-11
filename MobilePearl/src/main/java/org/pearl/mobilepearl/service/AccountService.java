package org.pearl.mobilepearl.service;

import java.util.List;

import org.pearl.mobilepearl.domain.Account;

public interface AccountService {
	public List<Account> getList();
	public Account login(String username, String password);
	public void save(Account account);
}
