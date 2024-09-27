package com.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
