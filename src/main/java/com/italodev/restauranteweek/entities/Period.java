package com.italodev.restauranteweek.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Period")
@Getter
@Setter
public class Period {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private String price;

}
