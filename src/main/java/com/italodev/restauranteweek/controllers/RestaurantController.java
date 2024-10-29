package com.italodev.restauranteweek.controllers;


import com.italodev.restauranteweek.entities.Restaurant;
import com.italodev.restauranteweek.services.interfaces.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {


    @Autowired
    IRestaurantService iRestaurantService;

    @PostMapping(name = "/cadastrar")
    public ResponseEntity<Restaurant> create(@RequestBody Restaurant restaurant){
        return new ResponseEntity<>(iRestaurantService.createRestaurant(restaurant), HttpStatus.CREATED);
    }

    @GetMapping(name = "/restaurante")
    public ResponseEntity<Optional<Restaurant>> getRestaurantById(@RequestParam long restaurantID){
        return new ResponseEntity<>(iRestaurantService.getRestaurantById(restaurantID), HttpStatus.OK);
    }
}
