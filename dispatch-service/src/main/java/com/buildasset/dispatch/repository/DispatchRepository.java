package com.buildasset.dispatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildasset.dispatch.entity.Dispatch;

public interface DispatchRepository
        extends JpaRepository<Dispatch, Long> {

}