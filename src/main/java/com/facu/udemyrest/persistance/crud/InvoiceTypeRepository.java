package com.facu.udemyrest.persistance.crud;

import com.facu.udemyrest.persistance.entities.InvoiceType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceTypeRepository extends CrudRepository<InvoiceType, Long> {
}
