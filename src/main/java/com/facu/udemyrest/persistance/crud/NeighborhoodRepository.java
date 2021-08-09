package com.facu.udemyrest.persistance.crud;

import com.facu.udemyrest.persistance.entities.Neighborhood;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodRepository extends CrudRepository<Neighborhood, Long> {
}
