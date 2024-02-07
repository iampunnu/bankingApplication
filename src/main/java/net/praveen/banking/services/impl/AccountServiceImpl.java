package net.praveen.banking.services.impl;

import net.praveen.banking.dto.AccountRequestDto;
import net.praveen.banking.dto.AccountResponseDto;
import net.praveen.banking.entity.Account;
import net.praveen.banking.mapper.AccountMapper;
import net.praveen.banking.repository.AccountRepository;
import net.praveen.banking.services.AccountService;
import net.praveen.banking.services.GenerateAccountNo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    static {
        System.out.println("this is AccountServiceImpl");
    }
    AccountRepository accountRepository;
    AccountMapper accountMapper;
    GenerateAccountNo generateAccountNo;

    public AccountServiceImpl(AccountRepository accountRepository,AccountMapper accountMapper,GenerateAccountNo
                              generateAccountNo){
        this.accountRepository=accountRepository;
        this.accountMapper=accountMapper;
        this.generateAccountNo=generateAccountNo;
    }
    @Override
    public AccountResponseDto createAccount(AccountRequestDto accountDto) {
        Account account= accountMapper.mapToAccountRequest(accountDto);
        account.setAccountNumber(generateAccountNo.genarateRandomString());

       Account account1= accountRepository.save(account);
        System.out.println(account1.toString());
        return accountMapper.mapToAccountResponse(account1);
    }

    @Override
    public List<AccountResponseDto> getAllAccount() {

        List<Account> account1=accountRepository.findAll();
        List<AccountResponseDto> accountResponseDtos=new ArrayList<>();
        for(Account account:account1){
            accountResponseDtos.add(accountMapper.mapToAccountResponse(account));
        }

        return accountResponseDtos;
    }

}
