package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CategoryRepositoryTest {

    @Autowired
    CategoryRepository underTest;

    @Test
    void existsByName() {
        String categoryName = "SUV";
        Category category = new Category();
        category.setName(categoryName);
        underTest.save(category);

        boolean existsByName = underTest.existsByName(categoryName);

        Assertions.assertTrue(existsByName);
    }

    @Test
    void existsByNameFalse() {
        String categoryName = "SUV";
        Category category = new Category();
        category.setName(categoryName);
        underTest.save(category);

        String categoryN = "HATCH";

        boolean existsByName = underTest.existsByName(categoryN);

        Assertions.assertFalse(existsByName);
    }

}