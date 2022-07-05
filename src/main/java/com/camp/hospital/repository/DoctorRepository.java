package com.camp.hospital.repository;

import com.camp.hospital.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findByEmail(String email);
    Doctor findByPassword(String password);
}