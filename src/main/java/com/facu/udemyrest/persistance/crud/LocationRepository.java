package com.facu.udemyrest.persistance.crud;

import com.facu.udemyrest.persistance.entities.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
