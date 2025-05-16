package com.desafioEmprestimos.emprestimos.dto;

import com.desafioEmprestimos.emprestimos.enums.LoansType;

public record LoanDto(LoansType loan, int rate) {

}
