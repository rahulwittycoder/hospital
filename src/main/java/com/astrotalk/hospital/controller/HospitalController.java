package com.astrotalk.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.astrotalk.hospital.entity.Patient;
import com.astrotalk.hospital.entity.Staff;
import com.astrotalk.hospital.services.HospitalService;

import jakarta.validation.Valid;

@RestController
public class HospitalController {
	@Autowired
	private HospitalService hs;
	@GetMapping("/patients")
	public List<Patient> getPatients()
	{
		return this.hs.getPatients();
	}
	
	@GetMapping("/patients/{room}")
	public ResponseEntity<?> getPatient(@PathVariable int room)
	{
		try {
			Patient p = this.hs.getPatient(room);
			if(p==null)
			{
				return new ResponseEntity<>("No such patient records found",HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<>(p.toString(),HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<>(e.toString(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping(path="/patients", consumes="application/json")
	public Patient admitPatient(@RequestBody Patient p)
	{
		return this.hs.admitPatient(p);
	}
	
	@PostMapping(path="/signup", consumes="application/json")
	public ResponseEntity<?> signup(@RequestBody @Valid Staff st,BindingResult bresult)
	{
		try {
			if(bresult.hasErrors())
			{
				 return new ResponseEntity<>(
				          bresult.toString(), 
				          HttpStatus.BAD_REQUEST);
			}
			else {
				return new ResponseEntity<>(this.hs.signUp(st), HttpStatus.OK);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/login")
	public ResponseEntity<?> login(@RequestBody Staff st)
	{
		return new ResponseEntity<>(this.hs.login(st.getUserame(), st.getPassword()),HttpStatus.OK);
	}
}


































