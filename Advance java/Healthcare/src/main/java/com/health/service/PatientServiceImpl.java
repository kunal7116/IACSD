package com.health.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.exception.ResoureNotFoundException;
import com.health.entities.Patient;
import com.health.repository.PatientRepository;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient addNewPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatientById(Long patient_id) {
		// inherited method - Optional<Patient> findById(Lond patient_Id)
		Optional<Patient> optional= patientRepository.findById(patient_id);
		return optional.orElseThrow(()-> new ResoureNotFoundException("No such patient exists!!"));
	}

	@Override
	public Patient UpdatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}
	
	

}
