package com.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.entities.Doctor;
import com.health.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping
	Doctor addNewDoctor(Doctor doctor) {
		System.out.println("in the add Doctor");
		return doctorService.addNewDoctor(doctor);
	}

}
