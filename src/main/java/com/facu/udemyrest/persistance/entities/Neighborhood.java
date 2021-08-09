package com.facu.udemyrest.persistance.entities;


import javax.persistence.*;

@Entity
@Table(name = "Barrios")
public class Neighborhood {

    @Id
    @Column(name = "id_barrio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBarrio;

    @Column(name = "nombre")
    private String name;

}
