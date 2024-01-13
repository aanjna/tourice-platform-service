package com.tourice.platform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class RoomType {
    @Id
    private Long typeId;

    String name;
    String description;
    List<String> amenities;


}
