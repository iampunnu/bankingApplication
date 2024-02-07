package net.praveen.banking.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.praveen.banking.entity.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountRequestDto {
    private double balance;
    private String account_type ;
    private String branch ;
    private String ifsc_code ;
    private String pin;
    private String email;
    private String accountstatus;


}
