package net.praveen.banking.services.impl;

import net.praveen.banking.entity.Account;
import net.praveen.banking.entity.Transaction;
import net.praveen.banking.repository.AccountRepository;
import net.praveen.banking.repository.TransactionRepository;
import net.praveen.banking.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    AccountRepository accountRepository;
    @Override
    public void save(Transaction t) {
           transactionRepository.save(t);
    }

    @Override
    public List<Transaction> showAllTransaction() {
        return transactionRepository.findAll();
    }
}
