package com.example.TablePerClassExample.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="HourlyEmployer")
public class HourlyEmployer extends Employer{

	private int noHoursPerDay;
	private double hourlyRate;
	public int getNoHoursPerDay() {
		return noHoursPerDay;
	}
	public void setNoHoursPerDay(int noHoursPerDay) {
		this.noHoursPerDay = noHoursPerDay;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
}
