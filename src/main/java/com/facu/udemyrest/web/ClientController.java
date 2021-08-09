package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.ClientService;
import com.facu.udemyrest.persistance.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200/"}, methods = RequestMethod.GET)
@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/all")
    public List<Client> getAll() {
        return this.service.findAll();
    }

    @GetMapping("/sup")
    public List<Client> getByRazonSocialContains(@RequestParam("razonSocialSuffix") String razonSocialSuffix ) {
        return this.service.findAllBySuffix(razonSocialSuffix);
    }
}
