package com.ghartur.LocaCar.service;

import com.ghartur.LocaCar.model.Car;

import java.util.List;


public interface CarService {

    Car saveCar(Car Car);
    Car findCarById(Long id);
    List<Car> findAllCars();
    void updateCar(Car Car);
    void deleteCarById(Long id);
    boolean existsByPlate(String plate);
    List<Car> findByAvailableTrue();

    //saveCar
    //findCarById
    //findAllCars
    //updateCar
    //deleteCarById
    //existsByPlate
    //findByAvailableTrue
}
