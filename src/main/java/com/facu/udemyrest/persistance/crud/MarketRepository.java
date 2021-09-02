package com.facu.udemyrest.persistance.crud;

import com.facu.udemyrest.persistance.entities.Market;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends CrudRepository<Market, Long> {
}
