package com.camp.hospital.controller;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Doctor;
import com.camp.hospital.service.AppointmentService;
import com.camp.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;

@RequestMapping("/doctor")
@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;
    //@Autowired
   // private  AppointmentService appointmentService;
    @PostMapping("/save")
    public Doctor save(@RequestBody Doctor doctor){
        return doctorService.saveDoctor(doctor);
    }

    @GetMapping("/getAll")
    public List<Doctor> getAll() {
        return doctorService.getDoctors();
    }

    @GetMapping("/branches")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<String> getAllBranches(){
        return doctorService.getAllBranches();
    }
   @PostMapping("/login")
    public ResponseEntity<Doctor> loginCheck(@RequestParam String email, @RequestParam String password) throws Exception {
        return new ResponseEntity<>(doctorService.getDoctor(email,password), HttpStatus.OK);
   }
   @GetMapping("/doctorBranch")
    public List<Doctor> doctorBranch(@RequestParam String branch){
        return doctorService.getAllDoctorByBranch(branch);
   }

}
