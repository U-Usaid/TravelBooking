package com.example.Travel.booking.system.Service;

import com.example.Travel.booking.system.Model.Flight;
import com.example.Travel.booking.system.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getAllFlight(){
        return flightRepository.findAll();
    }
}
