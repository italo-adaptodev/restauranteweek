package com.italodev.restauranteweek.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Relation_Restaurant_Periods")
@Getter
@Setter
public class Relation_Restaurant_Periods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long restaurantID;
    private long periodID;

}
