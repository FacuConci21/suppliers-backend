package com.facu.udemyrest.persistance.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity @Table(name = "clientes")
public class Client implements Serializable {

    @Id @Column(name = "id_cli")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCli;

    @Column(name = "razon_social", nullable = true, length = 100)
    private String razonSocial;

    @Column(name = "fecha_activ", nullable = true, length = 100)
    private Date fechaActiv;

    @JoinColumn(name = "id_barrio")
    @ManyToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Neighborhood neighborhood;

    @JoinColumn(name = "tipo_cta")
    @ManyToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private AccountType accountType;

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

    public Date getFechaActiv() {
        return fechaActiv;
    }

    public void setFechaActiv(Date fechaActiv) {
        this.fechaActiv = fechaActiv;
    }

    public Neighborhood getNeighborhood() {
        return this.neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
