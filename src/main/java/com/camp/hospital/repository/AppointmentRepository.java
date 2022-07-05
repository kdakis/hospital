package com.camp.hospital.repository;

import com.camp.hospital.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    /*List<Appointment> findByTc(Long tc);*/

}