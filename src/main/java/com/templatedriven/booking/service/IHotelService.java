package com.templatedriven.booking.service;

import com.templatedriven.booking.dto.Hotel;

import java.util.List;

public interface IHotelService<TModel> extends ICrudService<TModel>{
    public default List<Hotel> SearchForHotel(String location) throws NoSuchMethodException {
        return null;
    }
}

