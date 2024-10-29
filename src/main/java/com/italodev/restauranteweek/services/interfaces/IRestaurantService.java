package com.italodev.restauranteweek.services.interfaces;

import com.italodev.restauranteweek.entities.Restaurant;

import java.util.List;
import java.util.Optional;

public interface IRestaurantService {

    Restaurant createRestaurant(Restaurant restaurant);
    Optional<Restaurant> getRestaurantById(Long id);
    List<Restaurant> listRestaurants();
}
