package com.ghartur.LocaCar.service;

import com.ghartur.LocaCar.model.Rental;


import java.util.List;


public interface RentalService {

    Rental saveRental(Rental Rental);
    Rental findRentalById(Long id);
    List<Rental> findAllRentals();
    void updateRental(Rental Rental);
    void deleteRentalById(Long id);
    double getDays(Rental rental);


}
