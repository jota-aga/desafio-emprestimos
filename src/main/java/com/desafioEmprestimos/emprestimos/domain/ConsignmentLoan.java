package com.desafioEmprestimos.emprestimos.domain;

import com.desafioEmprestimos.emprestimos.dto.LoanDto;
import com.desafioEmprestimos.emprestimos.entity.Costumer;
import com.desafioEmprestimos.emprestimos.enums.LoansType;

public class ConsignmentLoan extends Loan {
	private LoansType loanConsignment;
	private int rate;
	private Costumer costumer;
	
	public ConsignmentLoan(Costumer costumer) {
		super(costumer);
		this.loanConsignment = LoansType.CONSIGNMENT;
		this.rate = LoansType.CONSIGNMENT.getRate();
		addLoan();
	}

	@Override
	public void addLoan() {
		LoanDto loanDto = new LoanDto(loanConsignment, rate);
		if(getCostumer().getIncome()>= 5000) {
			getCostumer().addAvailableLoans(loanDto);
		}
	}
	
	
}
