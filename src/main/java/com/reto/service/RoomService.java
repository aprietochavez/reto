package com.reto.service;

import com.reto.model.Room;
import com.reto.repository.RoomRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    public List<Room> getRooms() {
       return roomRepository.findAll();
    }

    public void createRoom(Room room) {
        roomRepository.save(room);
    }
}
