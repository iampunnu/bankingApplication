package net.praveen.banking.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequestDto {
    private String name;
    private String email;
    private String password;

    private String address;
    private String phone_number;
    private String role;

}
