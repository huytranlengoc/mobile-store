package org.pearl.mobilepearl.service;

import org.pearl.mobilepearl.domain.Account;
import org.pearl.mobilepearl.domain.POJO.CustomerRegistration;

public interface CustomerService {
	public Account addCustomer(CustomerRegistration customerRegistration);
}
