package com.example.Travel.booking.system.Repository;

import com.example.Travel.booking.system.Model.CarRental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentalRepository extends JpaRepository<CarRental,Integer> {
}
