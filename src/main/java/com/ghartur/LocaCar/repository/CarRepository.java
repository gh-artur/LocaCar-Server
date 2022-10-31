package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{
    boolean existsByPlate(String plate);
    List<Car> findByAvailableTrue();
}