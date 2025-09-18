package com.hms.patient_service.service;

import com.hms.patient_service.model.Patient;

import java.util.List;

public interface PatientService {
    Patient save(Patient patient);
    List<Patient> getAll();
    Patient getById(Integer ssn);
    void delete(Integer ssn);
}