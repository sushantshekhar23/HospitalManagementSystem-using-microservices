package com.hms.patient_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication




public class PatientServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatientServiceApplication.class, args);
	}


//	netstat -ano | findstr :8082 ->to kill if app is running on port 8082.open taskmanager and kill the process with the PID found in the previous command	.
}



