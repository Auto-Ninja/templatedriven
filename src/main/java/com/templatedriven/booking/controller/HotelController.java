package com.templatedriven.booking.controller;

import com.templatedriven.booking.dto.Hotel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/hotels")
@RestController("Hotel Api")
public class HotelController implements IRestApiController<Hotel> {


    @Operation(summary = "Create new Hotel")
    public void Post(Hotel hotel) {

    }
    @Operation(summary = "Update Hotel Details")
    public void Update(int Id, Hotel hotel) {

    }
    @Operation(summary = "Delete Hotel by Id")
    public void Delete(int id) {

    }

    @Operation(summary = "Get Hotel Details by Id")
    public Hotel Get(int Id) {
        return null;
    }

    @Operation(summary = "Get all Hotels")
    public List<Hotel> GetAll() {
        return null;
    }
}
