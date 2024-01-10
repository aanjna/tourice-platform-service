package com.tourice.platform.model;

import lombok.Data;

import java.util.List;

@Data
public class RoomType {
    Long typeId;
    String name;
    String description;
    List<String> amenities;
}
