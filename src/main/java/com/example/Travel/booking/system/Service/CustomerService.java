package com.example.Travel.booking.system.Service;

import com.example.Travel.booking.system.Model.Customer;
import com.example.Travel.booking.system.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
}
