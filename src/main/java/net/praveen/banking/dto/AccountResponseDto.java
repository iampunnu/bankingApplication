package net.praveen.banking.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountResponseDto implements Serializable {
    private String accountNumber;
    private double balance;
    private String branch ;
    private UserResponseDto userResponseDto;

}
