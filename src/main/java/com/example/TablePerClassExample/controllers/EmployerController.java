package com.example.TablePerClassExample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TablePerClassExample.model.Employer;
import com.example.TablePerClassExample.services.EmployerService;

@RestController
@RequestMapping("/employer")
public class EmployerController {
	
	@Autowired
	private EmployerService employerService;
	
	
	@PostMapping("/save")
	public ResponseEntity<?> saveEmployer(@RequestParam("empNo") int empNo,
			@RequestParam("eName") String eName, @RequestParam("annualSalary") double annualSalary){
		return employerService.saveEmployer(empNo, eName, annualSalary); 
	}

}
