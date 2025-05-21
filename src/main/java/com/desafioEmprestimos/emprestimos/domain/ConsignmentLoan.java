package com.desafioEmprestimos.emprestimos.domain;

import com.desafioEmprestimos.emprestimos.entity.Costumer;
import com.desafioEmprestimos.emprestimos.enums.LoansType;

public class ConsignmentLoan extends Loan {
	private LoansType type;
	private int rate;
	
	public ConsignmentLoan() {
		this.type = LoansType.CONSIGNMENT;
		this.rate = LoansType.CONSIGNMENT.getRate();
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
	
	public void addConsignmentLoanByRules(Costumer costumer) {
		ConsignmentLoan cl = new ConsignmentLoan();
		
		if(costumer.getIncome()<=3000) {
			costumer.addLoans(cl);	
		}
		else if(costumer.getIncome()>3000 && costumer.getIncome()<5000 && costumer.getAge()<30 && costumer.getLocation().equals("SP")) {
			costumer.addLoans(cl);		
		}
	}
	
	
}
