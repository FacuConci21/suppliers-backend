package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.irest.ApiService;
import com.facu.udemyrest.persistance.crud.BranchOfficeRepository;
import com.facu.udemyrest.persistance.entities.BranchOffice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchOfficeService implements ApiService<BranchOffice, Long> {

    @Autowired
    private BranchOfficeRepository repository;

    @Override
    public List<BranchOffice> findAll() {
        return (List<BranchOffice>) this.repository.findAll();
    }

    @Override
    public Optional<BranchOffice> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public BranchOffice save(BranchOffice branchOffice) {
        return this.repository.save(branchOffice);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
