package com.astrotalk.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.astrotalk.hospital.entity.Patient;
@Repository
public interface PatientDAO extends JpaRepository<Patient, Integer> {

}
