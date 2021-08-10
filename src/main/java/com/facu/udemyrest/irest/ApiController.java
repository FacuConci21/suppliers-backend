package com.facu.udemyrest.irest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

public interface ApiController<T, ID> {

    @GetMapping()
    List<T> getAll();

    @GetMapping()
    Optional<T> getById(ID id);

    @PostMapping()
    T post(T t);

    @DeleteMapping()
    void delete(ID id);

}
