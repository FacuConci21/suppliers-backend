package com.facu.udemyrest.persistance.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity @Table(name = "clientes")
public class Client implements Serializable {

    @Id @Column(name = "id_cli")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCli;

    @Column(name = "razon_social", nullable = true, length = 100)
    private String razonSocial;

    @Column(name = "fecha_activ", nullable = true, length = 100)
    private String fechaActiv;

    @JoinColumn(name = "id_barrio")
    @ManyToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Neighborhood neighborhood;

    public Long getIdCli() {
        return this.idCli;
    }

    public void setIdCli(Long idCli) {
        this.idCli = idCli;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getFechaActiv() {
        return this.fechaActiv;
    }

    public void setFechaActiv(String fechaActiv) {
        this.fechaActiv = fechaActiv;
    }

    public Neighborhood getNeighborhood() {
        return this.neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }
}
