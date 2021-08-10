package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.ClientService;
import com.facu.udemyrest.persistance.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.facu.udemyrest.irest.ApiController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = { "http://localhost:4200/"}, methods = RequestMethod.GET)
@RestController
@RequestMapping("/api/client")
public class ClientController implements ApiController<Client, Long> {

    @Autowired
    private ClientService service;

    @GetMapping("/all")
    public List<Client> getAll() {
        return this.service.findAll();
    }

    @GetMapping("/one/{id}")
    public Optional<Client> getById(@PathVariable("id") Long idClient) {
        return this.service.findById(idClient);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Client post(@RequestBody Client client) {
        return this.service.save(client);
    }

    @DeleteMapping("/delete")
    public void delete(Long idClient) {
        this.service.delete(idClient);
    }

}
