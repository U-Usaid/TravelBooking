package com.example.Travel.booking.system.Repository;

import com.example.Travel.booking.system.Model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod,Integer> {
}
