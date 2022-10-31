package com.ghartur.LocaCar.service.impl;

import com.ghartur.LocaCar.model.Car;
import com.ghartur.LocaCar.repository.CarRepository;
import com.ghartur.LocaCar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CarServiceImpl implements CarService {
    final CarRepository carRepository;
    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car saveCar(Car car) {
        boolean plateExists = carRepository.existsByPlate(car.getPlate());
        if (plateExists){
            throw new DuplicateKeyException("Car already exists");
        } else {
            carRepository.save(car);
        }
        return car;
    } //done

    @Override
    public Car findCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Car not found! Id: " + id));
    } //done

    @Override
    public List<Car> findAllCars() {
        return this.carRepository.findAll();
    } //done

    @Override
    public void updateCar(Car newCar) {
        Car car = carRepository.findById(newCar.getId())
                .orElseThrow(() -> new NoSuchElementException("Car not found! Id: " + newCar.getId()));
        car.setName(newCar.getName());
        car.setDescription(newCar.getDescription());
        car.setDailyPrice(newCar.getDailyPrice());
        car.setPlate(newCar.getPlate());
        car.setBrand(newCar.getBrand());
        car.setCategory(newCar.getCategory());
        car.setColor(newCar.getColor());
        car.setSpecifications(newCar.getSpecifications());

        carRepository.save(car);
    } //done

    @Override
    public void deleteCarById(Long id) {

        Car car = carRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Car not found! Id: " + id));
        carRepository.delete(car);
    }

    @Override
    public boolean existsByPlate(String plate) {
        return carRepository.existsByPlate(plate);
    }

    @Override
    public List<Car> findByAvailableTrue() {
        return carRepository.findByAvailableTrue();
    }
}
