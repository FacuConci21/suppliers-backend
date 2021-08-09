package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.persistance.crud.ClientRepository;
import com.facu.udemyrest.persistance.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {

    @Autowired()
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return (List<Client>) this.repository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Client> findAllBySuffix(String razonSocialSuffix) {
        return (List<Client>) this.repository.findByRazonSocialContaining(razonSocialSuffix);
    }
}
