package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.irest.ApiService;
import com.facu.udemyrest.persistance.crud.AccountTypeRepository;
import com.facu.udemyrest.persistance.entities.AccountType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountTypeService implements ApiService<AccountType, Long> {

    @Autowired
    private AccountTypeRepository repository;

    @Override
    public List<AccountType> findAll() {
        return (List<AccountType>) this.repository.findAll();
    }

    @Override
    public Optional<AccountType> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public AccountType save(AccountType accountType) {
        return this.repository.save(accountType);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
