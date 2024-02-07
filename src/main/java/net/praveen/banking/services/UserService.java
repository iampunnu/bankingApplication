package net.praveen.banking.services;

import net.praveen.banking.dto.UserRequestDto;
import net.praveen.banking.dto.UserResponseDto;

public interface UserService {
    public UserResponseDto createUser(UserRequestDto userRequestDto);
}
