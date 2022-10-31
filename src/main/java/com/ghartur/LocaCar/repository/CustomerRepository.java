package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    boolean existsByDriversLicence(String driversLicence);
}
