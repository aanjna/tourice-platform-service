package com.tourice.platform.repository;

import com.tourice.platform.model.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface BookingRepository extends JpaRepository<BookingDetails, Long> {

    List<BookingDetails> findByRoomId(Long roomId);

 Optional<BookingDetails> findByBookingConfirmationCode(String confirmationCode);

    List<BookingDetails> findByGuestEmail(String email);
}
