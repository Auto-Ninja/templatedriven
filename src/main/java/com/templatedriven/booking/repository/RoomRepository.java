package com.templatedriven.booking.repository;

import com.templatedriven.booking.dto.Hotel;
import com.templatedriven.booking.dto.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class RoomRepository implements IRepository<Room> {

    @Autowired
    public HotelRepository _hotelRepository;
    @Override
    public List<Room> GetAllData() {
        List<Room> roomList = new ArrayList<Room>();
        for (int i = 0; i < 200; i++) {
            Room room=new Room();
            int id=i+1;
            room.setId(id);
            room.setName("Room No "+id);
            room.setFloor(1);
            if(id>10)
                room.setFloor(id%10);
            Random rand = new Random();
            int hotelId = rand.nextInt(50);
            Hotel hotel =_hotelRepository.GetData(hotelId) ;
            room.setHotel(hotel);
            roomList.add(room);
        }
        return roomList;
    }

    @Override
    public Room GetData(int id) {
        if(id>200)
            try {
                throw new Exception("Not Room Found");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        Room room=new Room();
        room.setId(id);
        room.setName("Room No "+id);
        room.setFloor(1);
        if(id>10)
            room.setFloor(id%10);
        return room;
    }

    @Override
    public Room SaveData(Room room) {
        Random rand = new Random();
        int id = rand.nextInt(50);
        room.setId(id);
        return room;
    }

    @Override
    public Room UpdateData(int id, Room room) {
        return room;
    }

    @Override
    public boolean DeleteData(int id) {
        return false;
    }
}
