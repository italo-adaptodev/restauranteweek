package com.italodev.restauranteweek.repositories;

import com.italodev.restauranteweek.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository  extends JpaRepository<Restaurant, Long> {
}
