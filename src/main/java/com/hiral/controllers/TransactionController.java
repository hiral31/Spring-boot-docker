package com.hiral.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hiral.exceptions.InvalidTransationReferenceException;
import com.hiral.model.Transaction;
import com.hiral.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/create")
	public Long createTransaction(@RequestBody Transaction transaction) {
		transactionService.saveTransction(transaction);
		return transaction.getTransactionId();
	}
	
	@GetMapping("/viewAll")
	public Iterable<Transaction> viewAllTransaction(){
		return transactionService.getTransactionHistory();
	}
	
	@GetMapping("/view/{id}")
	public Transaction viewTransctionById(@PathVariable("id") Long id) {
		
		Optional<Transaction> transction=transactionService.getTransaction(id);
		
		if(transction.isPresent()) {
			return transction.get();
		}
		
		throw new InvalidTransationReferenceException("Invalid transaction reference provided");
	}
}
