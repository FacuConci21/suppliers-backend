package com.facu.udemyrest.persistance.crud;

import com.facu.udemyrest.persistance.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    List<Client> findByRazonSocialContaining(String razonSocial);

}
