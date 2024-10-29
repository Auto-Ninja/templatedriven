package com.templatedriven.booking.service;

import com.templatedriven.booking.dto.Hotel;
import com.templatedriven.booking.dto.Room;
import com.templatedriven.booking.repository.HotelRepository;
import com.templatedriven.booking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements IRoomService<Room>{
    @Autowired
    public RoomRepository _repository;

    public List<Room> GetAll() {
        return _repository.GetAllData();
    }

    public Room Get(int Id) {
        return _repository.GetData(Id);
    }

    public Room Create(Room room) {
        return _repository.SaveData(room);
    }

    public Room Update(int Id, Room room) {
        return _repository.UpdateData(Id,room);
    }
    public boolean Delete(int Id) {
        return _repository.DeleteData(Id);
    }
}
