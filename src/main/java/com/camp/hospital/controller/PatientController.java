package com.camp.hospital.controller;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Doctor;
import com.camp.hospital.model.Patient;
import com.camp.hospital.service.AppointmentService;
import com.camp.hospital.service.DoctorService;
import com.camp.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/patient")
@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/save")
    public Patient save(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.findAll();
    }

    /*@GetMapping("/{tc}/getAppointments")
    public List<Appointment> findAppointmentByTc(@PathVariable(value = "tc") Long tc) {
        return patientService.findAppointmentByTc(tc);
    }*/
}
