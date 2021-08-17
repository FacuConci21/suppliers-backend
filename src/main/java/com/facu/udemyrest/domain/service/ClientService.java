package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.irest.ApiService;
import com.facu.udemyrest.persistance.crud.ClientRepository;
import com.facu.udemyrest.persistance.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements ApiService<Client, Long> {

    @Autowired()
    private ClientRepository repository;

    public List<Client> findAll() {
        return (List<Client>) this.repository.findAll();
    }

    public Optional<Client> findById(Long idClient) {
        return this.repository.findById(idClient);
    }

    public Client save(Client client) {
        return this.repository.save(client);
    }

    public void delete(Long idClient) {
        this.repository.deleteById(idClient);
    }
}
