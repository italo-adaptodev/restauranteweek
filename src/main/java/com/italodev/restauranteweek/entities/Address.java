package com.italodev.restauranteweek.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "postalCode")
    private String postalCode;

    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private String number;

    @Column(name = "complement")
    private String complement;

    @Column(name = "neighborhood")
    private String neighborhood;

    @JoinColumn(name = "city")
    @ManyToOne
    private City city;

    @JoinColumn(name = "state")
    @ManyToOne
    private State state;

}
