package com.desafioEmprestimos.emprestimos.service;

import org.springframework.stereotype.Service;

import com.desafioEmprestimos.emprestimos.domain.ConsignmentLoan;
import com.desafioEmprestimos.emprestimos.domain.GuaranteedLoan;
import com.desafioEmprestimos.emprestimos.domain.PersonalLoan;
import com.desafioEmprestimos.emprestimos.entity.Costumer;


@Service
public class CostumerService {

	public void addLoans(Costumer costumer) {
		ConsignmentLoan cl = new ConsignmentLoan();
		GuaranteedLoan gl = new GuaranteedLoan();
		PersonalLoan pl = new PersonalLoan();
		
		cl.addConsignmentLoanByRules(costumer);
		gl.addGuaranteedLoanByRules(costumer);
		pl.addPersonalLoanByRules(costumer);
		
	}
	
	
}
