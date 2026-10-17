package com.buildasset.dispatch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buildasset.dispatch.entity.Dispatch;
import com.buildasset.dispatch.repository.DispatchRepository;

@Service
public class DispatchService {

    private final DispatchRepository repository;

    public DispatchService(DispatchRepository repository) {
        this.repository = repository;
    }

    public Dispatch createDispatch(Dispatch dispatch) {

        dispatch.setStatus("DISPATCHED");

        return repository.save(dispatch);
    }

    public List<Dispatch> getAllDispatches() {
        return repository.findAll();
    }

    public Dispatch getDispatchById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Dispatch updateStatus(Long id, String status) {

        Dispatch dispatch = repository.findById(id).orElse(null);

        if (dispatch != null) {
            dispatch.setStatus(status);
            return repository.save(dispatch);
        }

        return null;
    }

    public void deleteDispatch(Long id) {
        repository.deleteById(id);
    }
}