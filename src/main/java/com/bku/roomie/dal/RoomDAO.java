package com.bku.roomie.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bku.roomie.entity.Room;
@Repository
public interface RoomDAO extends JpaRepository<Room, Long> {
}
