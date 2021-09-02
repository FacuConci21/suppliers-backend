package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.LocationService;
import com.facu.udemyrest.persistance.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:4200/" }, methods = RequestMethod.GET)
@RequestMapping(value = "/api/location")
public class LocationController {

    @Autowired
    private LocationService service;

    @GetMapping("/all")
    private List<Location> getAllLocations() {
        return this.service.findAll();
    }
}
