package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.persistance.crud.NeighborhoodRepository;
import com.facu.udemyrest.persistance.entities.Neighborhood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeighborhoodService {

    @Autowired
    private NeighborhoodRepository repository;

    public List<Neighborhood> findAll() {
        return (List<Neighborhood>) this.repository.findAll();
    }
}
