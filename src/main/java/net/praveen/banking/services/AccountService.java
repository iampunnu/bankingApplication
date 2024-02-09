package net.praveen.banking.services;

import net.praveen.banking.dto.AccountRequestDto;
import net.praveen.banking.dto.AccountResponseDto;

import java.util.List;

public interface AccountService {
    AccountResponseDto createAccount(AccountRequestDto accountDto);
    List<AccountResponseDto> getAllAccount( );
    AccountResponseDto getAccountById( String id ) throws InterruptedException;


}
