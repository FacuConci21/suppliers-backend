package com.facu.udemyrest.irest;

import java.util.List;
import java.util.Optional;

public interface ApiService<T, ID> {

    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T t);

    void delete(ID id);
}
