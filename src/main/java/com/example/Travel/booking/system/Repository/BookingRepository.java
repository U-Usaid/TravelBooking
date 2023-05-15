package com.example.Travel.booking.system.Repository;

import com.example.Travel.booking.system.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {
}
