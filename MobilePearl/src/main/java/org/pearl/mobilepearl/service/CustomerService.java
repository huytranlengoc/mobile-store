package org.pearl.mobilepearl.service;

import org.pearl.mobilepearl.domain.Account;
import org.pearl.mobilepearl.domain.dto.CustomerRegistration;

public interface CustomerService {
	public Account addCustomer(CustomerRegistration customerRegistration);
}
