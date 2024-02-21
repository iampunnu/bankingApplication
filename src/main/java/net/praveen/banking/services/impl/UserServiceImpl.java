package net.praveen.banking.services.impl;

import net.praveen.banking.dto.UserRequestDto;
import net.praveen.banking.dto.UserResponseDto;
import net.praveen.banking.entity.User;
import net.praveen.banking.mapper.UserMapper;
import net.praveen.banking.repository.UserRepository;
import net.praveen.banking.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    static {
        System.out.println("this is UserServiceImpl");
    }

    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user= UserMapper.mapToUserRequest(userRequestDto);
        LocalDateTime now = LocalDateTime.now();
        user.setPassword(passwordEncoder.encode(userRequestDto.getPassword()));
        user.setLastOtpRequestTime(now);
        user.setOtpRetryCount(0);

        User user1=userRepository.save(user);
        return UserMapper.mapToUserResponse(user1);
    }
}
