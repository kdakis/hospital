package com.camp.hospital.service;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Doctor;
import com.camp.hospital.model.Patient;
import com.camp.hospital.repository.AppointmentRepository;
import com.camp.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getDoctors(){
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id){
        return doctorRepository.findById(id).orElse(null);
    }

    public Doctor getDoctor(String email, String password) {
        Doctor doctor;
        try {
            doctor = doctorRepository.findByEmail(email);
            if (password.equals(doctor.getPassword())) {
                return doctor;
            }
            throw new Exception("Unauthorised");
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

}
