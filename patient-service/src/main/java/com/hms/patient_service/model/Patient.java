package com.hms.patient_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    private Integer ssn;

    private String name;
    private String address;
    private String phone;
    private Integer insuranceId;
    private Integer pcp; // Primary Care Physician ID
}