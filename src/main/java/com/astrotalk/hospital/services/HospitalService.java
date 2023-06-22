package com.astrotalk.hospital.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.astrotalk.hospital.entity.Patient;
import com.astrotalk.hospital.entity.Staff;
@Service
public interface HospitalService {
	public List<Patient> getPatients();
	public Patient getPatient(int room);
	//public ResponseEntity<?> getPatient(int room);
	public Patient admitPatient(Patient p);
	//public ResponseEntity<?> admitPatient(Patient p);
	public ResponseEntity<?> signUp(Staff st);
	public ResponseEntity<?> login(String username, String password);
}
