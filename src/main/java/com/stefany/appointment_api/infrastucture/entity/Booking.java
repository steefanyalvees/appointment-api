package com.stefany.appointment_api.infrastucture.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String service;
    private LocalDateTime bookingSlot;
    private String hairDresser;
    private String costumer;
    private String cellphoneCostumer;
    private LocalDateTime createdData = LocalDateTime.now();

}
