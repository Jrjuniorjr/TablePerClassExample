package com.example.TablePerClassExample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.TablePerClassExample.interfacesdao.IEmployerDAO;
import com.example.TablePerClassExample.model.*;

@Service
public class EmployerService {
	
	@Autowired
	private IEmployerDAO iEmployerDAO;
	
	public ResponseEntity<?> saveEmployer(int empNo, String eName, double annualSalary){
		
		/*
		 * Observação 1 - Se for Employer employer = new SalariedEmployer() com o construtor feito por voce(com parametros)
		 * ou com o construtor default, e fizer save(employer),
		 * ele salva como type=SalariedEmployer 
		 * 
		 */
		
		/*
		 *Observação 2 - Mesmo se a super classe(nesse caso, employer) for a observação 1 também funciona.
		 *Só lembresse de tirar o DiscriminatorValue,  pois não faz sentido porque não é possivel instanciar.
		 */
		
		Employer employer = new SalariedEmployer();
		
		employer.setEmpNo(empNo);
		
		employer.seteName(eName);
				
		iEmployerDAO.save(employer);
		
		return ResponseEntity.ok("Empregado cadastrado com sucesso!");
		
	}
}
