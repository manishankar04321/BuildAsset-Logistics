package com.buildasset.dispatch.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.buildasset.dispatch.entity.Dispatch;
import com.buildasset.dispatch.service.DispatchService;

@RestController
@RequestMapping("/dispatch")
public class DispatchController {

    private final DispatchService service;

    public DispatchController(DispatchService service) {
        this.service = service;
    }

    @PostMapping
    public Dispatch createDispatch(
            @RequestBody Dispatch dispatch) {

        return service.createDispatch(dispatch);
    }

    @GetMapping
    public List<Dispatch> getAllDispatches() {
        return service.getAllDispatches();
    }

    @GetMapping("/{id}")
    public Dispatch getDispatchById(
            @PathVariable Long id) {

        return service.getDispatchById(id);
    }

    @PutMapping("/{id}/status")
    public Dispatch updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        return service.updateStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public String deleteDispatch(
            @PathVariable Long id) {

        service.deleteDispatch(id);

        return "Dispatch deleted successfully";
    }
}