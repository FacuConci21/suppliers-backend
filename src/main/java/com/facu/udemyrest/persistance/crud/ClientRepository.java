package com.facu.udemyrest.persistance.crud;

import com.facu.udemyrest.persistance.entities.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    @Query( value = "SELECT id_cli, razon_social, fecha_activ FROM Clientes WHERE razon_social LIKE '%sup%'",
            nativeQuery = true)
    List<Client> findAllBySuffix();
}
