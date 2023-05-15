package com.example.Travel.booking.system.Service;

import com.example.Travel.booking.system.Model.PaymentMethod;
import com.example.Travel.booking.system.Repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService {
    @Autowired
    PaymentMethodRepository paymentMethodRepository;

    public List<PaymentMethod> getAllPaymentMethod(){
        return paymentMethodRepository.findAll();
    }
}
