package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.InvoiceTypeService;
import com.facu.udemyrest.persistance.entities.InvoiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:4200/" }, methods = RequestMethod.GET)
@RequestMapping("/api/invoice-type")
public class InvoiceTypeController {

    @Autowired
    private InvoiceTypeService service;

    @GetMapping("/all")
    public List<InvoiceType> getAll() {
        return this.service.findAll();
    }
}
