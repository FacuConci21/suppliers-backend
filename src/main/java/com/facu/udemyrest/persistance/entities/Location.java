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

    public Long getIdLocalidad() {
        return this.idLocalidad;
    }

    public void setIdLocalidad(Long idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
