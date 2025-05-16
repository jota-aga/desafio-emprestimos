package com.desafioEmprestimos.emprestimos.domain;

import com.desafioEmprestimos.emprestimos.dto.LoanDto;
import com.desafioEmprestimos.emprestimos.entity.Costumer;
import com.desafioEmprestimos.emprestimos.enums.LoansType;

public class GuaranteedLoan extends Loan {
	private LoansType guaranteedLoan;
	private int rate;

	private Costumer costumer;
	
	public GuaranteedLoan(Costumer costumer) {
		super(costumer);
		this.guaranteedLoan = LoansType.GUARANTEED;
		this.rate = LoansType.GUARANTEED.getRate();
		addLoan();
	}

	@Override
	public void addLoan() {
		LoanDto loanDto = new LoanDto(guaranteedLoan, rate);
		if(getCostumer().getIncome()<=3000) {
			getCostumer().addAvailableLoans(loanDto);
			
		}
		else if(getCostumer().getIncome()>3000 && getCostumer().getIncome()<5000 && getCostumer().getAge()<30 && getCostumer().getLocation().equals("SP")) {
			getCostumer().addAvailableLoans(loanDto);
		}
	}

}
