package com.camp.hospital.service;

import com.camp.hospital.model.Appointment;
import com.camp.hospital.model.Doctor;
import com.camp.hospital.model.Patient;
import com.camp.hospital.repository.AppointmentRepository;
import com.camp.hospital.request.AppointmentCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientService patientService;
    @Autowired
    private DoctorService doctorService;

    public Appointment saveAppointment(AppointmentCreate appointment) {
        Patient patient = patientService.getPatientById(appointment.getPatientId());
        Doctor doctor = doctorService.getDoctorById(appointment.getDoctorId());
        Appointment toSave = new Appointment();
        toSave.setId(appointment.getId());
        toSave.setTime(appointment.getTime());
        toSave.setAppointmentDay(appointment.getAppointmentDay());
        toSave.setPatient(patient);
        toSave.setDoctor(doctor);
        return appointmentRepository.save(toSave);
    }

    public List<Appointment> getAllAppointments(Optional<Long> patientId){
        if(patientId.isPresent()){
            return appointmentRepository.findByPatientId(patientId.get());
        }
        return appointmentRepository.findAll();
    }


    /*public List<Appointment> findByPatient_Tc(Long patient_tc){
        return appointmentRepository.findByPatient_Tc(patient_tc);
    }*/
}
