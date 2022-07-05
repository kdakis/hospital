package com.camp.hospital.service;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment saveAppointment(Appointment appointment) {

        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointments(){
        return appointmentRepository.findAll();
    }


    /*public List<Appointment> findByPatient_Tc(Long patient_tc){
        return appointmentRepository.findByPatient_Tc(patient_tc);
    }*/
}
