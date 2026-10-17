package com.buildasset.rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildasset.rental.entity.Rental;

public interface RentalRepository
        extends JpaRepository<Rental, Long> {

}