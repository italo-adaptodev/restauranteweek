package com.italodev.restauranteweek.services.implementations;

import com.italodev.restauranteweek.entities.Restaurant;
import com.italodev.restauranteweek.repositories.RestaurantRepository;
import com.italodev.restauranteweek.services.interfaces.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RestauranteService implements IRestaurantService {

    RestaurantRepository restaurantRepository;

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Optional<Restaurant> getRestaurantById(Long id) {
        return restaurantRepository.findById(id);
    }

    @Override
    public List<Restaurant> listRestaurants() {
        return restaurantRepository.findAll();
    }
}
