package com.ghartur.LocaCar.controller;

import com.ghartur.LocaCar.dto.RentalDTO;
import com.ghartur.LocaCar.model.Rental;
import com.ghartur.LocaCar.service.CarService;
import com.ghartur.LocaCar.service.CustomerService;
import com.ghartur.LocaCar.service.RentalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/rental")
public class RentalController {
    private final RentalService rentalService;
    private final ModelMapper modelMapper;
    private final CarService carService;
    private final CustomerService customerService;

    @Autowired
    public RentalController(RentalService rentalService, ModelMapper modelMapper, CarService carService, CustomerService customerService) {
        this.rentalService = rentalService;
        this.modelMapper = modelMapper;
        this.carService = carService;
        this.customerService = customerService;
    }

    //saveRental
    @PostMapping
    public ResponseEntity<Rental> saveRental(@RequestBody RentalDTO newRental){
        Rental rental = modelMapper.map(newRental,Rental.class);
        Long carId = newRental.getCarId();
        Long customerId = newRental.getCustomerId();
        rental.setCarRental(carService.findCarById(carId));
        rental.setCustomer(customerService.findCustomer(customerId));
        rentalService.saveRental(rental);
        return ResponseEntity.status(HttpStatus.CREATED).body(rental);
    }
    //findRentalById
    @GetMapping("/{id}")
    public ResponseEntity<RentalDTO> findRental(@PathVariable Long id){
        Rental rental = rentalService.findRentalById(id);
        RentalDTO rentalResponse = modelMapper.map(rental,RentalDTO.class);
        return ResponseEntity.ok().body(rentalResponse);
    }

    //findAllRentals
    @GetMapping
    public List<RentalDTO> findAllRentals(){
        return rentalService.findAllRentals().stream()
                .map(rental -> modelMapper.map(rental,RentalDTO.class))
                .collect(Collectors.toList());
    }
    //updateRental
    @PutMapping("/{id}")
    public ResponseEntity<Rental> updateRental(@RequestBody RentalDTO newRental,
                                               @PathVariable Long id){
        Rental rental = rentalService.findRentalById(id);
        rental.setEndDate(newRental.getEndDate());
        rentalService.saveRental(rental);
        return ResponseEntity.ok().body(rental);
    }
    //deleteRentalById
    @DeleteMapping("/{id}")
    public void deleteRental(@PathVariable Long id){
        rentalService.deleteRentalById(id);
    }
}
