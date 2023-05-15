package com.example.Travel.booking.system.Repository;

import com.example.Travel.booking.system.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
