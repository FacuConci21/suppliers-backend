package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.LocationService;
import com.facu.udemyrest.persistance.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/location")
public class LocationController {

    @Autowired
    private LocationService service;

    @GetMapping("/all")
    private List<Location> getAllLocations() {
        return this.service.findAll();
    }
}
