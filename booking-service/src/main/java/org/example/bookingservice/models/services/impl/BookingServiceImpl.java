package org.example.bookingservice.models.services.impl;

import org.example.bookingservice.models.dto.requests.CreateBookingRequest;
import org.example.bookingservice.models.dto.responses.BookingResponse;
import org.example.bookingservice.models.services.BookingService;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Override
    public BookingResponse createBooking(CreateBookingRequest request) {
        return null;
    }
}
