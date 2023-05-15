package com.example.Travel.booking.system.Repository;

import com.example.Travel.booking.system.Model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Integer> {
}
