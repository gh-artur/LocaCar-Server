package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository underTest;

    @Test
    void existsByDriversLicence() {

        Customer customer = new Customer();
        customer.setDriversLicence("123");
        underTest.save(customer);

        boolean driversLicence = underTest.existsByDriversLicence("123");

        Assertions.assertTrue(driversLicence);
    }

    @Test
    void existsByDriversLicenceFalse() {

        Customer customer = new Customer();
        customer.setDriversLicence("123");
        underTest.save(customer);

        boolean driversLicence = underTest.existsByDriversLicence("1234");

        Assertions.assertFalse(driversLicence);
    }
}