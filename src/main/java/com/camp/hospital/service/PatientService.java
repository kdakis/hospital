package com.camp.hospital.service;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Patient;
import com.camp.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private CitizenService citizenService;

    public Boolean checkCitizen(Long id){
        if (citizenService.checkCitizen(id)) {
            return true;
        }else {
            return false;
        }
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatientById(Long id){
        return patientRepository.findById(id).orElse(null);
    }

    public List<Patient> findAll(){
        return patientRepository.findAll();
    }
    /*public List<Appointment> findAppointmentByTc(Long tc){
        Patient patient = getPatient(tc);
        return (List<Appointment>) patient.getAppointments();
    }*/
}
