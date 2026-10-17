package com.buildasset.contractor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildasset.contractor.entity.Contractor;

public interface ContractorRepository extends JpaRepository<Contractor, Long> {

}