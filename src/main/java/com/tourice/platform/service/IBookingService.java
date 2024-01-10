package com.tourice.platform.service;

import com.tourice.platform.model.BookingDetails;

import java.util.List;


public interface IBookingService {
    void cancelBooking(Long bookingId);

    List<BookingDetails> getAllBookingsByRoomId(Long roomId);

    String saveBooking(Long roomId, BookingDetails bookingRequest);

    BookingDetails findByBookingConfirmationCode(String confirmationCode);

    List<BookingDetails> getAllBookings();

    List<BookingDetails> getBookingsByUserEmail(String email);
}
