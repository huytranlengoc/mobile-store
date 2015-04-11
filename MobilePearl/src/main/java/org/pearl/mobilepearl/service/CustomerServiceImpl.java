package org.pearl.mobilepearl.service;

import org.pearl.mobilepearl.domain.Account;
import org.pearl.mobilepearl.domain.Customer;
import org.pearl.mobilepearl.domain.POJO.CustomerRegistration;
import org.pearl.mobilepearl.reposity.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private AccountService accountService;
	@Autowired
	private CustomerDAO customerDAO;
	@Override
	public Account addCustomer(CustomerRegistration customerRegistration) {
		Account acc = new Account();
		acc.setUsername(customerRegistration.getUsername());
		acc.setPassword(customerRegistration.getPassword());
		acc.setFirstname(customerRegistration.getFirstname());
		acc.setLastname(customerRegistration.getLastname());
		acc.setAuthority(2);
		this.accountService.save(acc);
		Customer cust = new Customer();
		cust.setUsername(acc.getUsername());
		cust.setAddress(customerRegistration.getAddress());
		cust.setCity(customerRegistration.getCity());
		cust.setCountry(customerRegistration.getCountry());
		cust.setNationality(customerRegistration.getNationality());
		cust.setPhone(customerRegistration.getPhone());
		this.customerDAO.save(cust);
		return acc;
	}
}
