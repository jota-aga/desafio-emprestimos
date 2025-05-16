package com.desafioEmprestimos.emprestimos.domain;
import com.desafioEmprestimos.emprestimos.entity.Costumer;
import com.desafioEmprestimos.emprestimos.enums.LoansType;

public abstract class Loan {
	private LoansType loan;
	private int rate;
	private Costumer costumer;
	
	public Loan(Costumer costumer) {
		this.costumer = costumer;
	}
	
	public abstract void addLoan();
	
	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public LoansType getLoan() {
		return loan;
	}

	public void setLoan(LoansType loan) {
		this.loan = loan;
	}

	public Costumer getCostumer() {
		return costumer;
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}
	
	
}
