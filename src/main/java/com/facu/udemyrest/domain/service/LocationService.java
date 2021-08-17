package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.irest.ApiService;
import com.facu.udemyrest.persistance.crud.LocationRepository;
import com.facu.udemyrest.persistance.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService implements ApiService<Location, Long> {

    @Autowired
    private LocationRepository repository;

    public List<Location> findAll() {
        return (List<Location>) this.repository.findAll();
    }

    @Override
    public Optional<Location> findById(Long aLong) {
        return null;
    }

    @Override
    public Location save(Location location) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
