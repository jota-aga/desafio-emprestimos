package com.desafioEmprestimos.emprestimos.dto;

import java.util.List;
import com.desafioEmprestimos.emprestimos.domain.Loan;

	public record ResponseLoansAvailableDto(String name, List<Loan> loans) {

	}
	

