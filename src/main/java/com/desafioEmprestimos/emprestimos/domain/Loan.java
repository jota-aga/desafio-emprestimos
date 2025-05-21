package com.desafioEmprestimos.emprestimos.domain;
import com.desafioEmprestimos.emprestimos.enums.LoansType;

public class Loan {
	private LoansType type;
	private int rate;
	
	
	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public LoansType getType() {
		return type;
	}

	public void setType(LoansType loan) {
		this.type = loan;
	}	
	
}
