package com.hiral.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiral.model.Transaction;
import com.hiral.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepository;
	
	public void saveTransction(Transaction transaction) {
		transactionRepository.save(transaction);
	}
	
	public Iterable<Transaction> getTransactionHistory(){
		return transactionRepository.findAll();
	}
	
	public Optional<Transaction> getTransaction(Long id){
		return transactionRepository.findById(id);
	}
}
