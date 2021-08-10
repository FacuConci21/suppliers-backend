package com.facu.udemyrest.irest;

import com.facu.udemyrest.persistance.entities.Client;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


public interface RestService<T, ID> {

    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T t);

    void delete(ID id);
}
