package com.desafioEmprestimos.emprestimos.domain;
import com.desafioEmprestimos.emprestimos.entity.Costumer;
import com.desafioEmprestimos.emprestimos.enums.LoansType;

public class PersonalLoan extends Loan {
	private LoansType type;
	private int rate;
	
	public PersonalLoan() {
		this.type = LoansType.PERSONAL;
		this.rate = LoansType.PERSONAL.getRate();
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
	
	public void addPersonalLoanByRules(Costumer costumer) {
		PersonalLoan pl = new PersonalLoan();
		if(costumer.getIncome()<=3000) {
			costumer.addLoans(pl);
	
		}
		else if(costumer.getIncome()>3000 && costumer.getIncome()<5000 && costumer.getAge()<30 && costumer.getLocation().equals("SP")) {
			costumer.addLoans(pl);
		}
	}
	
}
