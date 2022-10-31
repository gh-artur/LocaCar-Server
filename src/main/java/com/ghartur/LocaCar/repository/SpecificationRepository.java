package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificationRepository extends JpaRepository<Specification, Long>{

}
