package com.hms.patient_service.service;

import com.hms.patient_service.model.Patient;
import com.hms.patient_service.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getById(Integer ssn) {
        return patientRepository.findById(ssn).orElse(null);
    }

    @Override
    public void delete(Integer ssn) {
        patientRepository.deleteById(ssn);
    }
}