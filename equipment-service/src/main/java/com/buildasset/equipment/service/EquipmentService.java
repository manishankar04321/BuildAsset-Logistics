package com.buildasset.equipment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buildasset.equipment.entity.Equipment;
import com.buildasset.equipment.repository.EquipmentRepository;

@Service
public class EquipmentService {

    private final EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }

    public Equipment createEquipment(Equipment equipment) {
        return repository.save(equipment);
    }

    public List<Equipment> getAllEquipment() {
        return repository.findAll();
    }

    public Equipment getEquipmentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Equipment updateEquipment(Long id, Equipment equipment) {

        Equipment existing = repository.findById(id).orElse(null);

        if (existing != null) {

            existing.setName(equipment.getName());
            existing.setType(equipment.getType());
            existing.setModel(equipment.getModel());
            existing.setLocation(equipment.getLocation());
            existing.setStatus(equipment.getStatus());

            return repository.save(existing);
        }

        return null;
    }

    public void deleteEquipment(Long id) {
        repository.deleteById(id);
    }
}