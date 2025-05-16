package com.desafioEmprestimos.emprestimos.enums;

public enum LoansType {
	PERSONAL(4),
	GUARANTEED(3),
	CONSIGNMENT(2);
	
	private int rate;
	
	LoansType(int rate) {
		this.rate = rate;
	}

	public int getRate() {
		return rate;
	}
	
}
