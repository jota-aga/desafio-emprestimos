package com.desafioEmprestimos.emprestimos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.desafioEmprestimos.emprestimos.dto.ResponseLoansAvailableDto;
import com.desafioEmprestimos.emprestimos.entity.Costumer;
import com.desafioEmprestimos.emprestimos.service.CostumerService;

@RestController
public class Controller {
	@Autowired
	private CostumerService service;
	
	@PostMapping("/costumer-loans")
	public ResponseEntity<?> addCostumer(@RequestBody Costumer costumer){
		service.addLoans(costumer);
		ResponseLoansAvailableDto loansResponse = new ResponseLoansAvailableDto(costumer.getName(), costumer.getAvailableLoans());
		return ResponseEntity.ok().body(loansResponse);
	}
}
