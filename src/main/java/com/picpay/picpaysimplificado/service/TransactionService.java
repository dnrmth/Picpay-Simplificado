package com.picpay.picpaysimplificado.service;

import com.picpay.picpaysimplificado.dto.TransactionDTO;
import com.picpay.picpaysimplificado.entities.Transaction;
import com.picpay.picpaysimplificado.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction CreateTransaction(TransactionDTO transactionDTO) {
        Transaction transaction = new Transaction(transactionDTO);

        

        transactionRepository.save(transaction);

        return transaction;
    }
}
