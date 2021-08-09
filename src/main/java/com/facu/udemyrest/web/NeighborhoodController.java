package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.NeighborhoodService;
import com.facu.udemyrest.persistance.entities.Neighborhood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200/" }, methods = RequestMethod.GET)
@RestController
@RequestMapping("/api/neighborhood")
public class NeighborhoodController {

    @Autowired
    private NeighborhoodService service;

    @GetMapping("/all")
    public List<Neighborhood> getAllNeighbours() {
        return this.service.findAll();
    }
}
