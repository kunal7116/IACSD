package com.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.entities.Appointment;
import com.health.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
	
	
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping
	Appointment addNewAppointment(Appointment appointment)
	{
		System.out.println("in the add new appointment");
		return appointment;
		
	}
	

}
