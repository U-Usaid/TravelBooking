package com.example.Travel.booking.system.Service;

import com.example.Travel.booking.system.Model.Rating;
import com.example.Travel.booking.system.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;

    public List<Rating> getALlRating(){
        return ratingRepository.findAll();
    }
}
