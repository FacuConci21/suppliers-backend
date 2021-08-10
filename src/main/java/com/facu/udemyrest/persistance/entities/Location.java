package com.facu.udemyrest.persistance.entities;

import javax.persistence.*;

@Entity
@Table(name = "Localidades")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localidad")
    private Long idLocalidad;

    @Column(name = "nombre")
    private String name;

}
