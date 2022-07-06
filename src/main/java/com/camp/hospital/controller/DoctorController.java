package com.camp.hospital.controller;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Doctor;
import com.camp.hospital.service.AppointmentService;
import com.camp.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/doctor")
@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/save")
    public Doctor save(@RequestBody Doctor doctor){
        return doctorService.saveDoctor(doctor);
    }

    @GetMapping("/getAll")
    public List<Doctor> getAll() {
        return doctorService.getDoctors();
    }

    @GetMapping("/branches")
    public List<String> getAllBranches(){
        return doctorService.getAllBranches();
    }
}
