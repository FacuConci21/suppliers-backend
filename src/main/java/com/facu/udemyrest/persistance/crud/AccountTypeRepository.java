package com.facu.udemyrest.persistance.crud;

import com.facu.udemyrest.persistance.entities.AccountType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends CrudRepository<AccountType, Long> {
}
