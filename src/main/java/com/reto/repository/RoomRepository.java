package com.reto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reto.model.Room;


public interface RoomRepository extends JpaRepository<Room, Long> {

}
