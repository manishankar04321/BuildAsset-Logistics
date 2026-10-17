package com.buildasset.dispatch.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Dispatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long rentalId;

    private Long equipmentId;

    private String jobSite;

    private LocalDate dispatchDate;

    private String status;

    public Dispatch() {
    }

    public Dispatch(Long id, Long rentalId, Long equipmentId,
                    String jobSite, LocalDate dispatchDate,
                    String status) {

        this.id = id;
        this.rentalId = rentalId;
        this.equipmentId = equipmentId;
        this.jobSite = jobSite;
        this.dispatchDate = dispatchDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRentalId() {
        return rentalId;
    }

    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getJobSite() {
        return jobSite;
    }

    public void setJobSite(String jobSite) {
        this.jobSite = jobSite;
    }

    public LocalDate getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(LocalDate dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}