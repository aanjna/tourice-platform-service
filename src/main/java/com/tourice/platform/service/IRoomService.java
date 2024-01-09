package com.tourice.platform.service;

import com.tourice.platform.model.HotelRoom;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IRoomService {
    HotelRoom addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws SQLException, IOException;

    List<String> getAllRoomTypes();

    List<HotelRoom> getAllRooms();

    byte[] getRoomPhotoByRoomId(Long roomId) throws SQLException;

    void deleteRoom(Long roomId);

    HotelRoom updateRoom(Long roomId, String roomType, BigDecimal roomPrice, byte[] photoBytes);

    Optional<HotelRoom> getRoomById(Long roomId);

    List<HotelRoom> getAvailableRooms(LocalDate checkInDate, LocalDate checkOutDate, String roomType);
}
