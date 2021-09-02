package com.facu.udemyrest.persistance.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_cuenta")
public class AccountType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cta")
    private Long idCta;

    private String descrip;

    public Long getIdCta() {
        return idCta;
    }

    public void setIdCta(Long idCta) {
        this.idCta = idCta;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
