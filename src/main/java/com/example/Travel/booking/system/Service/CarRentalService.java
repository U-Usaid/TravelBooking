package com.example.Travel.booking.system.Service;

import com.example.Travel.booking.system.Model.CarRental;
import com.example.Travel.booking.system.Repository.CarRentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRentalService {
    @Autowired
    CarRentalRepository carRentalRepository;

    public List<CarRental> getAllCarRental(){
        return carRentalRepository.findAll();
    }
}
