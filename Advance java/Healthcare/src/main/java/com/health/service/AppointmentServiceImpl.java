package com.health.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.health.entities.Appointment;
import com.health.entities.Doctor;
import com.health.entities.Patient;
import com.health.exception.ResoureNotFoundException;
import com.health.repository.AppointmentRepository;
import com.health.repository.DoctorRepository;
import com.health.repository.PatientRepository;


@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	
	
	@Override
	public String addNewAppointment(Appointment appointment) {
		
		Patient patient = patientRepository.findById(appointment.getAppointment_id())
				.orElseThrow(()-> new ResoureNotFoundException("Not a valid patient id"));
	
		
		
		return null;
		
		
	
	}

}
