package com.astrotalk.hospital.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.astrotalk.hospital.dao.PatientDAO;
import com.astrotalk.hospital.dao.StaffDAO;
import com.astrotalk.hospital.entity.Patient;
import com.astrotalk.hospital.entity.Staff;
@Service
public class hospitalserviceImpl implements HospitalService {

	@Autowired
	private PatientDAO pd;
	
	@Autowired
	private StaffDAO sd;
	
	@Override
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Patient getPatient(int room) {
		// TODO Auto-generated method stub
		return pd.getOne(room);
	}

	@Override
	public Patient admitPatient(Patient p) {
		// TODO Auto-generated method stub
		return pd.save(p);
	}

	public ResponseEntity<?> signUp(Staff st) {
		// TODO Auto-generated method stub
		System.out.println(st);
		return new ResponseEntity<>(sd.save(st), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> login(String username, String password) {
		System.out.println(username+" , "+password);
		List<Staff> ls = sd.findAll();
		for(Staff s : ls)
		{
			System.out.println(s);
			if((s.getUserame()).equals(username) && (s.getPassword()).equals(password))
			{
				return new ResponseEntity<>("Login Success", HttpStatus.OK);
			}
		}
		return new ResponseEntity<>("Invalid Credentials", HttpStatus.UNAUTHORIZED);
	}
	
}
