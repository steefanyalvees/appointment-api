package com.stefany.appointment_api.service;

import com.stefany.appointment_api.infrastucture.entity.Booking;
import com.stefany.appointment_api.infrastucture.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BookingService {
    private BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking){

        LocalDateTime timeBooking = booking.getBookingSlot();
        LocalDateTime endingTime = booking.getBookingSlot().plusHours(1);
        Booking book = bookingRepository.findByServiceAndData(booking.getService(),timeBooking,endingTime);

        if (Objects.nonNull(book)){
            throw new RuntimeException("Slot now available");
        }
        return bookingRepository.save(booking);


    }
}
