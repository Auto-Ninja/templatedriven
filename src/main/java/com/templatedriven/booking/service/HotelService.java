package com.templatedriven.booking.service;

import com.templatedriven.booking.dto.Hotel;
import com.templatedriven.booking.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements IHotelService<Hotel>{

    @Autowired
    public HotelRepository _repository;
    public List<Hotel> GetAll() {
        return _repository.GetAllData();
    }
    public Hotel Get(int Id) {
        return _repository.GetData(Id);
    }
    public Hotel Create(Hotel hotel) {
        return _repository.SaveData(hotel);
    }
    public Hotel Update(int Id, Hotel hotel) {
        return _repository.UpdateData(Id,hotel);
    }
    public boolean Delete(int Id) {
        return _repository.DeleteData(Id);
    }
}
