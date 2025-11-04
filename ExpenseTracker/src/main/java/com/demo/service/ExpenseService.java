package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Expense;
import com.demo.repository.Respository;

@Service
public class ExpenseService {
	
	private final Respository repo;
	
	public ExpenseService(Respository repo) {
		this.repo=repo;
	}
	
	public List<Expense> getAllExpense(){
		return repo.findAll();
	}
	
	public Expense getExpenseById(Long id) {
		 return repo.findById(id).orElse(null);	
	}
	
	public Expense addExpense(Expense expense) {
		return repo.save(expense);
	}
	
	public Expense updateExpense(Long id, Expense expenseDetails) {
		
		Expense exp= repo.findById(id).orElseThrow();
		
		 exp.setTitle(expenseDetails.getTitle());
		 exp.setCategory(expenseDetails.getCategory());
		 exp.setAmount(expenseDetails.getAmount());
		 exp.setDate(expenseDetails.getDate());
		
		return repo.save(exp);
		
	}
	
	public void deleteExpense(Long id) {
		repo.deleteById(id);
	}
	

}
