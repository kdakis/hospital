package com.camp.hospital.repository;

import com.camp.hospital.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findByEmail(String email);
    Doctor findByPassword(String password);

    String FIND_BRANCHES = "SELECT DISTINCT branch FROM doctor";

    @Query(value = FIND_BRANCHES, nativeQuery = true)
    List<String> findAllBranches();


    List<Doctor> findByBranch(String branch);
}

