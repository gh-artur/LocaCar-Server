package com.ghartur.LocaCar.service.impl;

import com.ghartur.LocaCar.model.Customer;
import com.ghartur.LocaCar.repository.CustomerRepository;
import com.ghartur.LocaCar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomer(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Customer not found! Id: " + id));
    }

    @Override
    public List<Customer> listCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void updateCustomer(Customer newCustomer) {
        Customer customer = customerRepository.findById(newCustomer.getId())
                .orElseThrow(() -> new NoSuchElementException("Customer not found! Id: " + newCustomer.getId()));
        customer.setName(newCustomer.getName());
        customer.setAdress(newCustomer.getAdress());
        customer.setEmail(newCustomer.getEmail());
        customer.setBirthDay(newCustomer.getBirthDay());
        customer.setPhoneNumber(newCustomer.getPhoneNumber());

        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Customer not found! Id: " + id));
        customerRepository.delete(customer);
    }

    @Override
    public boolean customerExists(Customer customer) {
       return customerRepository.existsByDriversLicence(customer.getDriversLicence());
    }

}
