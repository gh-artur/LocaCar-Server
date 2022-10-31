package com.ghartur.LocaCar.service.impl;

import com.ghartur.LocaCar.model.Car;
import com.ghartur.LocaCar.model.Rental;
import com.ghartur.LocaCar.repository.RentalRepository;
import com.ghartur.LocaCar.service.CarService;
import com.ghartur.LocaCar.service.CustomerService;
import com.ghartur.LocaCar.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RentalServiceImpl implements RentalService {

    final
    RentalRepository rentalRepository;
    private CarService carService;
    private CustomerService customerService;

    @Autowired
    public RentalServiceImpl(RentalRepository rentalRepository, CarService carService, CustomerService customerService) {
        this.rentalRepository = rentalRepository;
        this.carService = carService;
        this.customerService = customerService;
    }

    @Override
    public Rental saveRental(Rental rental) {
        Car car =rental.getCarRental();
        car.setAvailable(false);
        double days = this.getDays(rental);
        double price = car.getDailyPrice();
        rental.setTotal(days*price);
        return rentalRepository.save(rental);
    }

    @Override
    public Rental findRentalById(Long id) {
        return rentalRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Category not found! Id: " + id));
    }

    @Override
    public List<Rental> findAllRentals() {
        return rentalRepository.findAll();
    }

    @Override
    public void updateRental(Rental rental) {
        Rental newRental = rentalRepository.findById(rental.getId())
                .orElseThrow(() -> new NoSuchElementException("Rental not found! Id: " + rental.getId()));
        newRental.setEndDate(rental.getEndDate());
        saveRental(newRental);
    }

    @Override
    public void deleteRentalById(Long id) {
        Rental rental = rentalRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Rental not found! Id: " + id));
        boolean isBefore = rental.getStartDate().isBefore(LocalDate.now());
        if (isBefore){
        rentalRepository.deleteById(id);
        }else{
            throw new UnsupportedOperationException("Rental already started!!!");
        }
    }

    @Override
    public double getDays(Rental rental) {
        LocalDate startDate = rental.getStartDate();
        LocalDate endDate = rental.getEndDate();
        return ChronoUnit.DAYS.between(startDate,endDate);
    }

}
