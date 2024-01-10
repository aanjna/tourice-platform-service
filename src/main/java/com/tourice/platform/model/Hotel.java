package com.tourice.platform.model;

import lombok.Data;

import java.util.List;

@Data
public class Hotel {
    Long hotel_id;
    String phoneNumber;
    String rating;
    Address address;
    List<HotelRoom> rooms;
}
