package com.desafioEmprestimos.emprestimos.domain;


import com.desafioEmprestimos.emprestimos.entity.Costumer;
import com.desafioEmprestimos.emprestimos.enums.LoansType;

public class GuaranteedLoan extends Loan {
	private LoansType type;
	private int rate;
	
	public GuaranteedLoan() {
		this.type = LoansType.GUARANTEED;
		this.rate = LoansType.GUARANTEED.getRate();
	}

	public LoansType getType() {
		return type;
	}

	public void setType(LoansType type) {
		this.type = type;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public void addGuaranteedLoanByRules(Costumer costumer) {
		GuaranteedLoan gl = new GuaranteedLoan();
		
		if(costumer.getIncome()>=5000) {
			costumer.addLoans(gl);
		}
	}


}
