package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.CarSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarSpecificationsRepository extends JpaRepository<CarSpecification,Long> {
}
