package com.facu.udemyrest.persistance.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Sucursales")
public class BranchOffice implements Serializable {
    
    @Id
    @Column(name = "id_suc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSuc;
    
    @Column(name = "nombre")
    private String name;

    public Long getIdSuc() {
        return idSuc;
    }

    public void setIdSuc(Long idSuc) {
        this.idSuc = idSuc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
