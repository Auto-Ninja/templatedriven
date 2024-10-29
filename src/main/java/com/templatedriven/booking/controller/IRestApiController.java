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
    TModel Post(TModel model);
    @PutMapping("/{id}")
    TModel Update(@PathVariable("id")int id,@RequestBody TModel model);
    @DeleteMapping("/{id}")
    boolean Delete(@PathVariable("id")int id);
    @GetMapping("/{id}")
    TModel Get(@PathVariable("id") int id);
    @GetMapping()
    List<TModel> GetAll();
}