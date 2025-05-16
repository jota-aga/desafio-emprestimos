package com.desafioEmprestimos.emprestimos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.desafioEmprestimos.emprestimos.domain.ConsignmentLoan;
import com.desafioEmprestimos.emprestimos.domain.GuaranteedLoan;
import com.desafioEmprestimos.emprestimos.domain.PersonalLoan;
import com.desafioEmprestimos.emprestimos.entity.Costumer;


@Service
public class CostumerService {

	public void addAvailableLoans(Costumer costumer) {
		ConsignmentLoan cl = new ConsignmentLoan(costumer);
		PersonalLoan pl = new PersonalLoan(costumer);
		GuaranteedLoan gl = new GuaranteedLoan(costumer);
		
	}
	
	
}
