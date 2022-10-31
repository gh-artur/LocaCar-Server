package com.ghartur.LocaCar.controller;

import com.ghartur.LocaCar.dto.CarDTO;
import com.ghartur.LocaCar.model.Car;
import com.ghartur.LocaCar.service.BrandService;
import com.ghartur.LocaCar.service.CarService;
import com.ghartur.LocaCar.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CarController {

    private final CarService carService;
    private final ModelMapper modelMapper;
    private BrandService brandService;
    private CategoryService categoryService;

    @Autowired
    public CarController(CarService carService, ModelMapper modelMapper, BrandService brandService, CategoryService categoryService) {
        this.carService = carService;
        this.modelMapper = modelMapper;
        this.brandService = brandService;
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Car> findAll(){
        return carService.findAllCars();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarDTO> findById(@PathVariable Long id) {
        Car car = carService.findCarById(id);
        CarDTO carResponse=modelMapper.map(car,CarDTO.class);
        return ResponseEntity.ok().body(carResponse);
    }

    //saveCar
    @PostMapping
    public ResponseEntity<CarDTO> saveCar(@RequestBody CarDTO newCar){
        Car car = modelMapper.map(newCar,Car.class);
        Long categoryId = newCar.getCategory();
        Long brandId = newCar.getCategory();
        car.setBrand(brandService.findBrandById(brandId));
        car.setCategory(categoryService.findCategoryById(brandId));
        carService.saveCar(car);

        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }

    //findCarById


    //updateCar
    @PutMapping
    public ResponseEntity<CarDTO> updateCar(@RequestBody CarDTO newCar){
        Car car = modelMapper.map(newCar,Car.class);
        carService.updateCar(car);

        return new ResponseEntity<>(newCar,HttpStatus.ACCEPTED);

    }
    //deleteCarById
    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable Long id){
        carService.deleteCarById(id);
    }
     //findByAvailableTrue
}
