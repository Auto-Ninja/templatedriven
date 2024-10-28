package com.templatedriven.booking.dto;

public class Hotel extends BaseModel {
    private String _location;

    public String getLocation() {
        return _location;
    }

    public void setLocation(String Location) {
        this._location = Location;
    }
}
