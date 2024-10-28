package com.templatedriven.booking.controller;

import com.templatedriven.booking.dto.Hotel;
import com.templatedriven.booking.service.ICrudService;
import com.templatedriven.booking.service.IHotelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/hotels")
@RestController("Hotel Api")
public class HotelController implements IRestApiController<Hotel> {

    @Autowired
    public IHotelService<Hotel> _service;
    @Operation(summary = "Create new Hotel")
    public Hotel Post(Hotel hotel) {
        return _service.Create(hotel);
    }
    @Operation(summary = "Update Hotel Details")
    public Hotel Update(int id, Hotel hotel) {
        return _service.Update(id,hotel);
    }
    @Operation(summary = "Delete Hotel by Id")
    public boolean Delete(int id) {
        return _service.Delete(id);
    }
    @Operation(summary = "Get Hotel Details by Id")
    public Hotel Get(int Id) {
        return _service.Get(Id);
    }
    @Operation(summary = "Get all Hotels")
    public List<Hotel> GetAll() {
        return _service.GetAll();
    }
}
