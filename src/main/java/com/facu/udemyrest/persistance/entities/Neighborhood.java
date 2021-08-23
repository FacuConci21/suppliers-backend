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

    @JoinColumn(name = "id_localidad")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Location location;

    public Long getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(Long idBarrio) {
        this.idBarrio = idBarrio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
