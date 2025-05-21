package com.desafioEmprestimos.emprestimos.entity;

import java.util.ArrayList;
import java.util.List;
import com.desafioEmprestimos.emprestimos.domain.Loan;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "costumer_db")
public class Costumer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private int age;
	@Column
	private String cpf;
	@Column
	private String name;
	@Column
	private double income;
	@Column
	private String location;
	@Transient
	private List<Loan> availableLoans = new ArrayList<>();

	public Costumer(int age, String cpf, String name, double income, String location) {
		super();
		this.age = age;
		this.cpf = cpf;
		this.name = name;
		this.income = income;
		this.location = location;
	}

	public Costumer() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public List<Loan> getAvailableLoans() {
		return availableLoans;
	}

	public void addLoans(Loan loan) {
		availableLoans.add(loan);
	}
}
