package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Expense;

public interface Respository extends JpaRepository<Expense, Long>{

}
