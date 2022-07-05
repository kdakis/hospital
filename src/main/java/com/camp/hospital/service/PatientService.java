package com.camp.hospital.service;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Patient;
import com.camp.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    /*public Patient getPatientById(Long tc){
        return patientRepository.findById(tc).orElse(null);
    }*/

    public List<Patient> findAll(){
        return patientRepository.findAll();
    }
    /*public List<Appointment> findAppointmentByTc(Long tc){
        Patient patient = getPatient(tc);
        return (List<Appointment>) patient.getAppointments();
    }*/
}
