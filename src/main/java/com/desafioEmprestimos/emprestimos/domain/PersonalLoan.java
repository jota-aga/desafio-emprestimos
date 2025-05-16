package com.desafioEmprestimos.emprestimos.domain;
import com.desafioEmprestimos.emprestimos.dto.LoanDto;
import com.desafioEmprestimos.emprestimos.entity.Costumer;
import com.desafioEmprestimos.emprestimos.enums.LoansType;

public class PersonalLoan extends Loan {
	private LoansType personalLoan;
	private int rate;

	private Costumer costumer;
	
	public PersonalLoan(Costumer costumer) {
		super(costumer);
		this.personalLoan = LoansType.PERSONAL;
		this.rate = LoansType.PERSONAL.getRate();
		addLoan();
	}

	@Override
	public void addLoan() {
		LoanDto loanDto = new LoanDto(personalLoan, rate);
		if(getCostumer().getIncome()<=3000) {
			getCostumer().addAvailableLoans(loanDto);
			
		}
		else if(getCostumer().getIncome()>3000 && getCostumer().getIncome()<5000 && getCostumer().getAge()<30 && getCostumer().getLocation().equals("SP")) {
			getCostumer().addAvailableLoans(loanDto);
		}
	}
}
