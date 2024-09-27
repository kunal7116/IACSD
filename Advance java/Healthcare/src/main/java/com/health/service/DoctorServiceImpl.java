package com.health.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.entities.Doctor;
import com.health.repository.DoctorRepository;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Doctor addNewDoctor(Doctor doctor) {
		System.out.println("In add new doctor"+doctor);
		return doctorRepository.save(doctor);
	}

}
