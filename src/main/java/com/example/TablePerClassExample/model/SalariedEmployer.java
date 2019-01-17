package com.example.TablePerClassExample.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="SalariedEmployer")
public class SalariedEmployer extends Employer{

	private double annualSalary;

	
	public SalariedEmployer(int empNo, String eName, double annualSalary) {
		super(empNo, eName);
		this.annualSalary = annualSalary;
	}

	public SalariedEmployer() {
		
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
}
