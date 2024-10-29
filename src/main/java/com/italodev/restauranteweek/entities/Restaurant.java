package com.italodev.restauranteweek.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Table(name = "Restaurant")
@Getter
@Setter
public class Restaurant {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "reserveRequired")
    private boolean reserveRequired;

    @Column(name = "phone")
    private String phone;

    @Column(name = "contactPhone")
    private String contactPhone;

    @JoinColumn(name = "address")
    @OneToOne
    private Address address;

    private ArrayList<Cuisine> cuisines;

    private ArrayList<Period> periods;

}
