package com.winaldo.springdemo.service;

import java.util.List;

import com.winaldo.springdemo.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public Customer deleteCustomer(int theId);
}
