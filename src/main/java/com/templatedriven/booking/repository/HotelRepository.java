package com.templatedriven.booking.repository;

import com.templatedriven.booking.dto.Hotel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class HotelRepository implements IRepository<Hotel> {
    @Override
    public List<Hotel> GetAllData() {
        List<Hotel> hotelList = new ArrayList<Hotel>();
        for (int i = 0; i < 200; i++) {
            Hotel hotel=new Hotel();
            int id=i+1;
            hotel.setId(id);
            hotel.setName("Hotel Name "+id);
            hotel.setLocation("Hotel Location "+id);
            hotelList.add(hotel);
        }
        return hotelList;
    }

    @Override
    public Hotel GetData(int id) {
        if(id>200)
            try {
                throw new Exception("Not Room Found");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        Hotel hotel=new Hotel();
        hotel.setId(id);
        hotel.setName("Hotel Name "+id);
        hotel.setLocation("Hotel Location "+id);
        return hotel;
    }

    @Override
    public Hotel SaveData(Hotel hotel) {
        Random rand = new Random();
        int id = rand.nextInt(50);
        hotel.setId(id);
        return hotel;
    }

    @Override
    public Hotel UpdateData(int id, Hotel hotel) {
        return hotel;
    }

    @Override
    public boolean DeleteData(int id) {
        return false;
    }
}
