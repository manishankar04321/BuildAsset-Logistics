package com.buildasset.equipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildasset.equipment.entity.Equipment;

public interface EquipmentRepository
        extends JpaRepository<Equipment, Long> {

}