package com.example.Travel.booking.system.Service;

import com.example.Travel.booking.system.Model.Flight;
import com.example.Travel.booking.system.Model.Hotel;
import com.example.Travel.booking.system.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    HotelRepository hotelRepository;

    public List<Hotel> getAllHotel(){
        return hotelRepository.findAll();
    }
}
