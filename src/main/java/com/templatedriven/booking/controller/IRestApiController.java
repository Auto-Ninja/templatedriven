package com.templatedriven.booking.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface IRestApiController<TModel> {

    @PostMapping()
    void Post(TModel model);

    @PutMapping("/{id}")
    void Update(int Id,TModel model);

    @DeleteMapping("/{id}")
    void Delete(int id);

    @GetMapping("/{id}")
    TModel Get(int Id);

    @GetMapping()
    List<TModel> GetAll();

}