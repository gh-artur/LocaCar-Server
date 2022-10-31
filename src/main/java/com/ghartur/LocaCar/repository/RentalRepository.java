package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long>{

}
