package com.example.Travel.booking.system.Service;

import com.example.Travel.booking.system.Model.Review;
import com.example.Travel.booking.system.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    public List<Review> getALlReview(){
        return reviewRepository.findAll();
    }

}
