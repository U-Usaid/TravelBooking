package com.example.Travel.booking.system.Service;

import com.example.Travel.booking.system.Model.Booking;
import com.example.Travel.booking.system.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public List<Booking> getAllBooking(){
        return bookingRepository.findAll();
    }
}
