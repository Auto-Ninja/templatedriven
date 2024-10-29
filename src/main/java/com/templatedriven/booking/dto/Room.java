package com.templatedriven.booking.dto;

public class Room extends BaseModel {
    private Integer _floor;

    public Integer getFloor() {
        return _floor;
    }

    public void setFloor(Integer Floor) {
        this._floor = Floor;
    }


    private Hotel _hotel;

    public Hotel getHotel() {
        return _hotel;
    }

    public void setHotel(Hotel hotel) {
        this._hotel = hotel;
    }
}
