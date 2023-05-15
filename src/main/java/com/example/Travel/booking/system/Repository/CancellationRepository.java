package com.example.Travel.booking.system.Repository;

import com.example.Travel.booking.system.Model.Cancellation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancellationRepository extends JpaRepository<Cancellation,Integer> {
}
