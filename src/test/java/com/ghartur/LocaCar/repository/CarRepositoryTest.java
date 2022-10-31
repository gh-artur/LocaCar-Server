package com.ghartur.LocaCar.repository;

import com.ghartur.LocaCar.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class CarRepositoryTest {

    @Autowired
    CarRepository underTest;


    @Test
    void existsByPlate() {
        Car car = new Car();
        car.setPlate("123");
        underTest.save(car);

        boolean existsByPlate = underTest.existsByPlate("123");

        Assertions.assertTrue(existsByPlate);

    }

    @Test
    void findByAvailableTrue() {
    }
}