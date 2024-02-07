package net.praveen.banking.mapper;

import net.praveen.banking.dto.AccountRequestDto;
import net.praveen.banking.dto.AccountResponseDto;
import net.praveen.banking.entity.Account;
import net.praveen.banking.entity.User;
import net.praveen.banking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

   @Autowired
   UserRepository userRepository;
    public  Account mapToAccountRequest(AccountRequestDto accountDto){
        Account account=new Account();
        account.setBalance(accountDto.getBalance());
        account.setBranch(accountDto.getBranch());
        account.setAccount_type(accountDto.getAccount_type());
        account.setIfsc_code(accountDto.getIfsc_code());
        account.setPin(accountDto.getPin());
        User u=userRepository.findByEmail(accountDto.getEmail());
        System.out.println(u.toString());
        account.setUser(u);
        account.setAccountstatus(accountDto.getAccountstatus());

        return account;
    }
    public  AccountResponseDto mapToAccountResponse(Account account){
        AccountResponseDto accountDto=new AccountResponseDto();
        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setBalance(account.getBalance());
        accountDto.setBranch(account.getBranch());
        accountDto.setUserResponseDto(UserMapper.mapToUserResponse(account.getUser()));

        return accountDto;
    }
}
