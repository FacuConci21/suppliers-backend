package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.ClientService;
import com.facu.udemyrest.persistance.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.facu.udemyrest.irest.ApiController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = { "http://localhost:4200/"},
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
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
    public ResponseEntity<?> getById(@PathVariable("id") Long idClient) {
        Optional<Client> client = null;
        Map<String, Object> response = new HashMap<>();

        try {
            client = this.service.findById(idClient);
        } catch (DataAccessException e) {
            response.put("message", "Produced while consulting Client by Id");
            response.put("error", e.getMessage());
            response.put("cause", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (client.isEmpty()) {
            response.put("message", "Client not found (by ID).");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> post(@RequestBody Client client) {
        Client newClient = null;
        Map<String, Object> response = new HashMap();

        try {
            newClient = this.service.save(client);
        } catch (DataAccessException e) {
            response.put("message", "Produced while creating new Client record");
            response.put("error", e.getMessage());
            response.put("cause", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("message", "Client created successful");
        response.put("content", newClient);
        return new ResponseEntity<Map<String,Object>>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long idClient) {
        Map<String, Object> response = new HashMap();

        try {
            this.service.delete(idClient);
        } catch (DataAccessException e) {
            response.put("message", "Produced while deleting Client record");
            response.put("error", e.getMessage());
            response.put("cause", e.getMostSpecificCause().getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("message", "Client deleted successful");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

}
