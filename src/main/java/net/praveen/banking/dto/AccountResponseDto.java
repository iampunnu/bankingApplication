package net.praveen.banking.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountResponseDto {
    private String accountNumber;
    private double balance;
    private String branch ;
    private UserResponseDto userResponseDto;

}
