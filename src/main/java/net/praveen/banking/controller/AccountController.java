package net.praveen.banking.controller;

import net.praveen.banking.dto.AccountRequestDto;
import net.praveen.banking.dto.AccountResponseDto;
import net.praveen.banking.services.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
public class AccountController {
    private AccountService accountService;
    AccountController(AccountService accountService){
        this.accountService=accountService;
    }


    @PostMapping
    public ResponseEntity<AccountResponseDto> addAccount(@RequestBody AccountRequestDto accountDto){
        AccountResponseDto accountDto1=accountService.createAccount(accountDto);
        return new ResponseEntity<>(accountDto1, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<AccountResponseDto>> addAccount(){
       List< AccountResponseDto >accountDto1=accountService.getAllAccount();
        return new ResponseEntity<>(accountDto1, HttpStatus.CREATED);
    }



}
