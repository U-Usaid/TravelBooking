package com.example.Travel.booking.system.Repository;

import com.example.Travel.booking.system.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Integer> {
}
