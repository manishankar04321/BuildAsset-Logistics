package com.buildasset.contractor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buildasset.contractor.entity.Contractor;
import com.buildasset.contractor.repository.ContractorRepository;

@Service
public class ContractorService {

    private final ContractorRepository repository;

    public ContractorService(ContractorRepository repository) {
        this.repository = repository;
    }

    public Contractor createContractor(Contractor contractor) {
        return repository.save(contractor);
    }

    public List<Contractor> getAllContractors() {
        return repository.findAll();
    }

    public Contractor getContractorById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Contractor updateContractor(Long id, Contractor contractor) {

        Contractor existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(contractor.getName());
            existing.setEmail(contractor.getEmail());
            existing.setPhone(contractor.getPhone());
            existing.setCompany(contractor.getCompany());

            return repository.save(existing);
        }

        return null;
    }

    public void deleteContractor(Long id) {
        repository.deleteById(id);
    }
}