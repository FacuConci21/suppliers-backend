package com.facu.udemyrest.domain.service;

import com.facu.udemyrest.irest.ApiService;
import com.facu.udemyrest.persistance.crud.MarketRepository;
import com.facu.udemyrest.persistance.entities.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarketService implements ApiService<Market, Long> {

    @Autowired
    private MarketRepository repository;

    @Override
    public List<Market> findAll() {
        return (List<Market>) this.repository.findAll();
    }

    @Override
    public Optional<Market> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Market save(Market market) {
        return this.repository.save(market);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
