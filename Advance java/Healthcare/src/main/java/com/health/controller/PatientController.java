package com.health.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.entities.Patient;
import com.health.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	
	public PatientController() {
		System.out.println("in the ctor of" + getClass());
	}
	
	@PostMapping
	public Patient addNewPatient(@RequestBody Patient patient) {
		System.out.println("in add new patient" + patient);
		return patientService.addNewPatient(patient);
	}
	
	@GetMapping
	public List<Patient> GetAllPatient (){
		System.out.println("in the get all patient");
		return patientService.getAllPatient();
	}
	
	@GetMapping("/{patient_id}")
	//because of path variable we can find the data for particular id and the 
	//url generated after the request is
	//'http://localhost:8080/patients/2' 
	public Patient patient(@PathVariable Long patient_id) {
		return patientService.getPatientById(patient_id);
	}
	
	@PutMapping
	public Patient patient(Patient patient) {
		return patientService.UpdatePatient(patient);
	}
	
	

}
