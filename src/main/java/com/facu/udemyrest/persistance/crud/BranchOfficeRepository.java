package com.facu.udemyrest.persistance.crud;

import com.facu.udemyrest.persistance.entities.BranchOffice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchOfficeRepository extends CrudRepository<BranchOffice, Long> {
}
