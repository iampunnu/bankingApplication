package net.praveen.banking.repository;

import net.praveen.banking.entity.Account;
import net.praveen.banking.entity.Transaction;
import net.praveen.banking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TransactionRepository  extends JpaRepository<Transaction,Long> {
    List<Transaction> findBySourceAccount(Account account);
}
