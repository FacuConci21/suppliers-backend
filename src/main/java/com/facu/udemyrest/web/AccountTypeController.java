package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.AccountTypeService;
import com.facu.udemyrest.persistance.entities.AccountType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:4200/" }, methods = RequestMethod.GET)
@RequestMapping("/api/account-type")
public class AccountTypeController {

    @Autowired
    private AccountTypeService service;

    @GetMapping("/all")
    public List<AccountType> getAll() {
        return this.service.findAll();
    }
}
