package net.praveen.banking.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponseDto implements Serializable {
    private String name;
    private String email;
    private String address;
    private String role;
}
