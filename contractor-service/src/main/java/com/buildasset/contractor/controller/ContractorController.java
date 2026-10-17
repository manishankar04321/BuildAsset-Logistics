package com.buildasset.contractor.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.buildasset.contractor.entity.Contractor;
import com.buildasset.contractor.service.ContractorService;

@RestController
@RequestMapping("/contractors")
public class ContractorController {

    private final ContractorService service;

    public ContractorController(ContractorService service) {
        this.service = service;
    }

    @PostMapping
    public Contractor createContractor(@RequestBody Contractor contractor) {
        return service.createContractor(contractor);
    }

    @GetMapping
    public List<Contractor> getAllContractors() {
        return service.getAllContractors();
    }

    @GetMapping("/{id}")
    public Contractor getContractorById(@PathVariable Long id) {
        return service.getContractorById(id);
    }

    @PutMapping("/{id}")
    public Contractor updateContractor(
            @PathVariable Long id,
            @RequestBody Contractor contractor) {

        return service.updateContractor(id, contractor);
    }

    @DeleteMapping("/{id}")
    public String deleteContractor(@PathVariable Long id) {

        service.deleteContractor(id);

        return "Contractor deleted successfully";
    }
}