package com.facu.udemyrest.persistance.crud;

import com.facu.udemyrest.persistance.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
