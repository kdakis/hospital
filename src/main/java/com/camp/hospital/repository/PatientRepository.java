package com.camp.hospital.repository;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}