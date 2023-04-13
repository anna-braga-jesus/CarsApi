package com.exercise.cars.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.cars.dto.CarsDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
    @PostMapping
    public void create(@RequestBody CarsDTO req){
        System.out.println(req);
    }
}

