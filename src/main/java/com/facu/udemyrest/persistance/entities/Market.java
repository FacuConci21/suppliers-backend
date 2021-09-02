package com.facu.udemyrest.persistance.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rubros")
public class Market implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rubro")
    private Long idMarket;

    private String descrip;

    public Long getIdMarket() {
        return idMarket;
    }

    public void setIdMarket(Long idMarket) {
        this.idMarket = idMarket;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
