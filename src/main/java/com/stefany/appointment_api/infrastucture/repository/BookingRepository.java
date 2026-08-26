package com.stefany.appointment_api.infrastucture.repository;

import com.stefany.appointment_api.infrastucture.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    Booking findByServiceAndData(String service, LocalDateTime timeBooking  , LocalDateTime endingTime);
}
