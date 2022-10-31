package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long>{
    boolean existsByName(String name);
}
