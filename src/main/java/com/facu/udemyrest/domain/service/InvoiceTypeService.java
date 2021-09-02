package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.irest.ApiService;
import com.facu.udemyrest.persistance.crud.InvoiceTypeRepository;
import com.facu.udemyrest.persistance.entities.InvoiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceTypeService implements ApiService<InvoiceType, Long> {

    @Autowired
    private InvoiceTypeRepository repository;

    @Override
    public List<InvoiceType> findAll() {
        return (List<InvoiceType>) this.repository.findAll();
    }

    @Override
    public Optional<InvoiceType> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public InvoiceType save(InvoiceType invoiceType) {
        return this.repository.save(invoiceType);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
