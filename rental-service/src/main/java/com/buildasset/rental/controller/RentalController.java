package com.buildasset.rental.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.buildasset.rental.entity.Rental;
import com.buildasset.rental.service.RentalService;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    private final RentalService service;

    public RentalController(RentalService service) {
        this.service = service;
    }

    @PostMapping
    public Rental createRental(@RequestBody Rental rental) {
        return service.createRental(rental);
    }

    @GetMapping
    public List<Rental> getAllRentals() {
        return service.getAllRentals();
    }

    @GetMapping("/{id}")
    public Rental getRentalById(@PathVariable Long id) {
        return service.getRentalById(id);
    }

    @PutMapping("/{id}")
    public Rental updateRental(
            @PathVariable Long id,
            @RequestBody Rental rental) {

        return service.updateRental(id, rental);
    }

    @DeleteMapping("/{id}")
    public String deleteRental(@PathVariable Long id) {

        service.deleteRental(id);

        return "Rental deleted successfully";
    }
}