package com.buildasset.equipment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.buildasset.equipment.entity.Equipment;
import com.buildasset.equipment.service.EquipmentService;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    private final EquipmentService service;

    public EquipmentController(EquipmentService service) {
        this.service = service;
    }

    @PostMapping
    public Equipment createEquipment(
            @RequestBody Equipment equipment) {

        return service.createEquipment(equipment);
    }

    @GetMapping
    public List<Equipment> getAllEquipment() {

        return service.getAllEquipment();
    }

    @GetMapping("/{id}")
    public Equipment getEquipmentById(
            @PathVariable Long id) {

        return service.getEquipmentById(id);
    }

    @PutMapping("/{id}")
    public Equipment updateEquipment(
            @PathVariable Long id,
            @RequestBody Equipment equipment) {

        return service.updateEquipment(id, equipment);
    }

    @DeleteMapping("/{id}")
    public String deleteEquipment(
            @PathVariable Long id) {

        service.deleteEquipment(id);

        return "Equipment deleted successfully";
    }
}