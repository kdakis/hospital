package com.camp.hospital.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Doctor {

    @Id
    @GeneratedValue
    private Long ID;
    private String name;
    private String surName;
    private String branch;

    /*@OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="doctor_id")
    private Set<Appointment> appointments;*/

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /*public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }*/
}
