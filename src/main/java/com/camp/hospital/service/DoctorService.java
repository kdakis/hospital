package com.camp.hospital.service;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Doctor;
import com.camp.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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



    public Doctor getDoctor(String email, String password) throws  Exception {
        Doctor doctor = doctorRepository.findByEmail(email);
            if(doctor==null || !password.equals(doctor.getPassword()))
                throw new EntityNotFoundException("Unauthorised");
        return doctor;

    }

}
