package org.pearl.mobilepearl.reposity;

import java.util.List;

import org.pearl.mobilepearl.domain.Account;

public interface AccountDao {
	public List<Account> getList();
	public Account getAccount(String username);
	public void save(Account account);
}
