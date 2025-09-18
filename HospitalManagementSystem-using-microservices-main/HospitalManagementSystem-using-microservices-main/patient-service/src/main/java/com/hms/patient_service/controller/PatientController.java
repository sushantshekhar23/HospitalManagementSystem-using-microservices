package com.hms.patient_service.controller;

import com.hms.patient_service.model.Patient;
import com.hms.patient_service.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping
    public Patient save(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    @GetMapping
    public List<Patient> getAll() {
        return patientService.getAll();
    }

    @GetMapping("/{ssn}")
    public Patient getById(@PathVariable Integer ssn) {
        return patientService.getById(ssn);
    }

    @DeleteMapping("/{ssn}")
    public void delete(@PathVariable Integer ssn) {
        patientService.delete(ssn);
    }

    //testing
    @GetMapping("/test")
    public String test() {
        return "Patient Service through API Gateway works!";
    }
}