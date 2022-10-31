package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.CarImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarImageRepository extends JpaRepository<CarImage, Long>{

}
