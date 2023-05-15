package com.example.Travel.booking.system.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Data
@Entity
public class Cancellation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

}
