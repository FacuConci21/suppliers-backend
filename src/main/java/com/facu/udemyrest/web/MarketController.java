package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.MarketService;
import com.facu.udemyrest.persistance.entities.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:4200/" }, methods = RequestMethod.GET)
@RequestMapping("/api/market")
public class MarketController {

    @Autowired
    private MarketService service;

    @GetMapping("/all")
    private List<Market> getAll() {
        return this.service.findAll();
    }
}
