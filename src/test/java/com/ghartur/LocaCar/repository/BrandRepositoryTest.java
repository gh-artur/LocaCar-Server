package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.Brand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class BrandRepositoryTest {

    @Autowired
    BrandRepository underTest;

    @Test
    void existsByName() {

        String brandName = "Honda";
        Brand brand = new Brand();
        brand.setName(brandName);
        underTest.save(brand);

        boolean existsByName = underTest.existsByName(brandName);

        Assertions.assertTrue(existsByName);

    }
}