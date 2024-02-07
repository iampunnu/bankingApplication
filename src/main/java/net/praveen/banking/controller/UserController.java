package net.praveen.banking.controller;

import net.praveen.banking.dto.UserRequestDto;
import net.praveen.banking.dto.UserResponseDto;
import net.praveen.banking.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {
    UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> addAccount(@RequestBody UserRequestDto userRequestDto){
        UserResponseDto accountDto1=userService.createUser(userRequestDto);
        return new ResponseEntity<>(accountDto1, HttpStatus.CREATED);
    }
}
