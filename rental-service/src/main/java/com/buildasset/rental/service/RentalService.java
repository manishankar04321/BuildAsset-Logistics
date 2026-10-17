package com.buildasset.rental.service;

import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.stereotype.Service;

import com.buildasset.rental.entity.Rental;
import com.buildasset.rental.repository.RentalRepository;

@Service
public class RentalService {

    private final RentalRepository repository;

    public RentalService(RentalRepository repository) {
        this.repository = repository;
    }

    public Rental createRental(Rental rental) {

        long duration = ChronoUnit.DAYS.between(
                rental.getStartDate(),
                rental.getEndDate()
        );

        rental.setDuration(duration);
        rental.setStatus("BOOKED");

        return repository.save(rental);
    }

    public List<Rental> getAllRentals() {
        return repository.findAll();
    }

    public Rental getRentalById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Rental updateRental(Long id, Rental rental) {

        Rental existing = repository.findById(id).orElse(null);

        if (existing != null) {

            existing.setContractorId(rental.getContractorId());
            existing.setEquipmentId(rental.getEquipmentId());
            existing.setStartDate(rental.getStartDate());
            existing.setEndDate(rental.getEndDate());

            long duration = ChronoUnit.DAYS.between(
                    rental.getStartDate(),
                    rental.getEndDate()
            );

            existing.setDuration(duration);

            return repository.save(existing);
        }

        return null;
    }

    public void deleteRental(Long id) {
        repository.deleteById(id);
    }
}