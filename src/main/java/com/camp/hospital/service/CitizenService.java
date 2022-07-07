package com.camp.hospital.service;

import com.camp.hospital.model.Citizen;
import com.camp.hospital.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CitizenService {
    @Autowired
    private CitizenRepository citizenRepository;

    public Boolean checkCitizen(Long id){
        if (citizenRepository.findById(id).isPresent()){
            return true;
        }else {
            return false;
        }
    }
    public Citizen saveCitizen(Citizen citizen){
        return citizenRepository.save(citizen);
    }



}
