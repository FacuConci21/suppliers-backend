package com.facu.udemyrest.irest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface ApiController<T, ID> {

    @GetMapping()
    List<T> getAll();

    @GetMapping()
    ResponseEntity<?> getById(ID id);

    @PostMapping()
    ResponseEntity<?> post(T t);

    @DeleteMapping()
    ResponseEntity<?> delete(ID id);

}
