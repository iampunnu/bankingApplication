package net.praveen.banking.mapper;

import net.praveen.banking.dto.UserRequestDto;
import net.praveen.banking.dto.UserResponseDto;
import net.praveen.banking.entity.User;

public class UserMapper {
    public static User mapToUserRequest(UserRequestDto userRequestDto){
              User user=new User();
              user.setName(userRequestDto.getName());
              user.setAddress(userRequestDto.getAddress());
              user.setEmail(userRequestDto.getEmail());
              user.setPassword(userRequestDto.getPassword());
              user.setPhone_number(userRequestDto.getPhone_number());
              return user;


    }

    public static UserResponseDto mapToUserResponse(User userRequestDto){
        UserResponseDto user=new UserResponseDto();
        user.setName(userRequestDto.getName());
        user.setAddress(userRequestDto.getAddress());
        user.setEmail(userRequestDto.getEmail());
        return user;
    }
}
