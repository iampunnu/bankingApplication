package net.praveen.banking.controller;

import net.praveen.banking.dto.AccountRequestDto;
import net.praveen.banking.dto.AccountResponseDto;
import net.praveen.banking.entity.Transaction;
import net.praveen.banking.entity.TransactionType;
import net.praveen.banking.repository.AccountRepository;
import net.praveen.banking.services.AccountService;
import net.praveen.banking.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/tran")
public class TransactionController {

    private TransactionService accountService;
    @Autowired
    private AccountRepository accountRepository;

    TransactionController(TransactionService accountService){
        this.accountService=accountService;
    }


    @PostMapping
    public ResponseEntity<String> addAccount(@RequestBody Map<String,Object> accountDto){
        Transaction t=new Transaction();
        t.setAmount((Double)accountDto.get("amount"));
        t.setSourceAccount(accountRepository
                .findByAccountNumber(accountDto.get("sourceAccount").toString()));

        t.setTargetAccount(accountRepository
                .findByAccountNumber(accountDto.get("targetAccount").toString()));
        t.setTransactionType(TransactionType.CASH_TRANSFER);

        accountService.save(t);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
