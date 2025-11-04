package com.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Expense;
import com.demo.service.ExpenseService;

@RestController
public class ExpenseController {
	
	private final ExpenseService service;
	
	public ExpenseController(ExpenseService service){
		this.service=service;
	}
	
	@GetMapping
	public List<Expense> getAllExpense(){
		
		return service.getAllExpense();
	}
	
	@GetMapping("/id")
	public Expense getExpenseById(Long id) {
		
		return service.getExpenseById(id);
	}
	
	@PostMapping
	public Expense addExpense(Expense expense) {
		return service.addExpense(expense);
	}
	
	@PutMapping("/id")
	public Expense updateExpense(Long id, Expense expense) {
		return service.updateExpense(id, expense);
	}
	
	@DeleteMapping("/id")
	public void deleteExpense(Long id) {
		service.deleteExpense(id);
	}
	

}
