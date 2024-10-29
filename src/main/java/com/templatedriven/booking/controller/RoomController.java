package com.templatedriven.booking.controller;

import com.templatedriven.booking.dto.Room;
import com.templatedriven.booking.service.IRoomService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/rooms")
@RestController("Rooms Api for managing CRUD operations")
public class RoomController implements IRestApiController<Room> {
    @Autowired
    public IRoomService<Room> _service;

    @Operation(summary = "Create new Room")
    public Room Post(Room room) {
        return _service.Create(room);
    }

    @Operation(summary = "Update Room Details")
    public Room Update(int id, Room room) {
        return _service.Update(id, room);
    }

    @Operation(summary = "Delete Room by Id")
    public boolean Delete(int id) {
        return _service.Delete(id);
    }

    @Operation(summary = "Get Room Details by Id")
    public Room Get(int Id) {
        return _service.Get(Id);
    }

    @Operation(summary = "Get all Rooms")
    public List<Room> GetAll() {
        return _service.GetAll();
    }
}
