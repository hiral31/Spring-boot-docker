package com.hiral.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.model.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction,Long>{

}
