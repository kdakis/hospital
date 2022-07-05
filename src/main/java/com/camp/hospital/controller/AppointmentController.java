package com.camp.hospital.controller;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Doctor;
import com.camp.hospital.model.Patient;
import com.camp.hospital.request.AppointmentCreate;
import com.camp.hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/appointment")
@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/save")
    public Appointment save(@RequestBody AppointmentCreate appointment){
        return appointmentService.saveAppointment(appointment);
    }

    /*@GetMapping("/findByPatient")
    public List<Appointment> findByPatient_Tc(@RequestParam Long patient_tc) {
        return appointmentService.findByPatient_Tc(patient_tc);
    }*/
    @GetMapping("{patientId}")
    public List<Appointment> getByPatient(@RequestParam Optional<Long> patientId) {
        return appointmentService.getAllAppointments(patientId);
    }

    /*@GetMapping("/findByPatient/{patient_tc}")
    public Appointment findByPatient_Tc(@PathVariable String patient_tc) {
        return appointmentService.findByPatient_Tc(patient_tc);
    }*/
}
//Kazım