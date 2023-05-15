package com.example.Travel.booking.system.Service;

import com.example.Travel.booking.system.Model.Cancellation;
import com.example.Travel.booking.system.Repository.CancellationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancellationService {
    @Autowired
    CancellationRepository cancellationRepository;

    public List<Cancellation> getAllCancellation(){
        return cancellationRepository.findAll();
    }
}
