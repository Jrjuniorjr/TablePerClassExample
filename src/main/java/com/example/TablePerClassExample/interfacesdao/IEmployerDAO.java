package com.example.TablePerClassExample.interfacesdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TablePerClassExample.model.Employer;

public interface IEmployerDAO extends JpaRepository<Employer, Integer>{
	public Employer findByEmpNo(int empNo);
}
