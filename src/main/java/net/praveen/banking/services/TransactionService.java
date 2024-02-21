package net.praveen.banking.services;

import net.praveen.banking.entity.Account;
import net.praveen.banking.entity.Transaction;
import net.praveen.banking.entity.User;

import java.util.List;

public interface TransactionService {

    public void save(Transaction t);
    List<Transaction > showAllTransaction();
}
