package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.persistance.crud.LocationRepository;
import com.facu.udemyrest.persistance.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository repository;

    public List<Location> findAll() {
        return (List<Location>) this.repository.findAll();
    }
}
