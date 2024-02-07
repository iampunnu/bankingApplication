package net.praveen.banking.repository;

import net.praveen.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findById(long id);
    List<Account> findAll();
}
