package com.facu.udemyrest.web;

import com.facu.udemyrest.domain.service.BranchOfficeService;
import com.facu.udemyrest.irest.ApiController;
import com.facu.udemyrest.persistance.entities.BranchOffice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = { "http://localhost:4200/" }, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping(value = "/api/branch-office")
public class BranchOfficeController implements ApiController<BranchOffice, Long> {

    @Autowired
    private BranchOfficeService service;

    @Override
    @GetMapping("/all")
    public List<BranchOffice> getAll() {
        return this.service.findAll();
    }

    @Override
    @GetMapping("/one/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        Optional<BranchOffice> branchOffice = null;
        Map<String, Object> result = new HashMap();

        try {
            branchOffice = this.service.findById(id);
        } catch (DataAccessException e) {
            result.put("message", "Error while getting Branch Office by id");
            result.put("error", e.getMessage());
            result.put("cause", e.getMostSpecificCause().getMessage());

            return new ResponseEntity<Map<String, Object>>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (branchOffice.isEmpty()) {
            result.put("message", "Branch Office not found (by Id).");
            return new ResponseEntity<Map<String, Object>>(result, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(branchOffice, HttpStatus.OK);
    }

    @Override
    @PostMapping("/create")
    public ResponseEntity<?> post(@RequestBody BranchOffice branchOffice) {
        Map<String, Object> result = new HashMap();
        BranchOffice newBranchOffice = null;

        try {
            newBranchOffice = this.service.save(branchOffice);
        } catch (DataAccessException e) {
            result.put("message", "Error while posting Branch Office");
            result.put("error", e.getMessage());
            result.put("cause", e.getMostSpecificCause().getMessage());

            return new ResponseEntity<Map<String, Object>>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        result.put("message", "Branch Office created successful");
        result.put("content", newBranchOffice);
        return new ResponseEntity<Map<String,Object>>(result, HttpStatus.CREATED);
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        this.service.delete(id);
    }
}
