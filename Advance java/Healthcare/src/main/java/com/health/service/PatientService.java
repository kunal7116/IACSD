package com.health.service;

import java.util.List;


import com.health.entities.Patient;

public interface PatientService {
	//add a method to add patient
	Patient addNewPatient(Patient patient);
	
	//add a method list all patient
	List<Patient> getAllPatient();
	
	//add a method to find the patient id 
	Patient getPatientById(Long patient_id);
	
	//add a method to update the patient details
	Patient UpdatePatient(Patient patient);

}
