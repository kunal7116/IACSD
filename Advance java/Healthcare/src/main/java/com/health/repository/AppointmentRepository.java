package com.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
