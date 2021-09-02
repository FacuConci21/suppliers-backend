package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.AccountTypeService;
import com.facu.udemyrest.persistance.entities.AccountType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/account-type")
public class AccountTypeController {

    @Autowired
    private AccountTypeService service;

    @GetMapping("/all")
    public List<AccountType> getAll() {
        return this.service.findAll();
    }
}
