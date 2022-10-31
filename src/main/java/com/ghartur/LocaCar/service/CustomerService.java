package com.ghartur.LocaCar.service;

import com.ghartur.LocaCar.model.Customer;

import java.util.List;


public interface CustomerService {

    Customer createCustomer(Customer Customer);
    Customer findCustomer(Long id);
    List<Customer> listCustomers();
    void updateCustomer(Customer Customer);
    void deleteCustomer(Long id);
    boolean customerExists(Customer customer);
}
