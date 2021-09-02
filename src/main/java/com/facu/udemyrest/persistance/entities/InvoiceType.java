package com.facu.udemyrest.persistance.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_factura")
public class InvoiceType implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_fac")
    private Long idTipoFac;

    private String descrip;

    public Long getIdTipoFac() {
        return idTipoFac;
    }

    public void setIdTipoFac(Long idTipoFac) {
        this.idTipoFac = idTipoFac;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
