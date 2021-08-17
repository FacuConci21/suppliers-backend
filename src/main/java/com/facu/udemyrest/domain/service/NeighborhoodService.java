package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.irest.ApiService;
import com.facu.udemyrest.persistance.crud.NeighborhoodRepository;
import com.facu.udemyrest.persistance.entities.Neighborhood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NeighborhoodService implements ApiService<Neighborhood, Long> {

    @Autowired
    private NeighborhoodRepository repository;

    public List<Neighborhood> findAll() {
        return (List<Neighborhood>) this.repository.findAll();
    }

    @Override
    public Optional<Neighborhood> findById(Long aLong) {
        return null;
    }

    @Override
    public Neighborhood save(Neighborhood neighborhood) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
