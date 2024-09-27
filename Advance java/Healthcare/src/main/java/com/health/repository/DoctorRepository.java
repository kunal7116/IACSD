package com.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.health.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
