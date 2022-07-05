package com.camp.hospital.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Patient {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surName;
    private int birthYear;

    /*@OneToMany(targetEntity = Appointment.class, fetch = FetchType.EAGER)
    @JoinColumn(name="tc")
    private Set<Appointment> appointments;*/

    public Long getTc() {
        return id;
    }

    public void setTc(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /*public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }*/
}