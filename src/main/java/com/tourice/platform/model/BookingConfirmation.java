package com.tourice.platform.model;

import lombok.Data;

@Data
public class BookingConfirmation {
    Long bookingId;
    Hotel hotel;
    HotelRoom room;

    double totalPrice;

}
