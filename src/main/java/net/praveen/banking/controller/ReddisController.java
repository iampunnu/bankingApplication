package net.praveen.banking.controller;

import net.praveen.banking.dto.AccountRequestDto;
import net.praveen.banking.dto.AccountResponseDto;
import net.praveen.banking.entity.Student;
import net.praveen.banking.services.AccountService;
import net.praveen.banking.services.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/reddis")
public class ReddisController {
    @Autowired
    private StudentDao empDao;

    @PostMapping
    public ResponseEntity<Student> addAccount(@RequestBody Student accountDto){
        empDao.saveEmployee(accountDto);
        return new ResponseEntity<>(accountDto, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Map<Integer,Student>> getAll(){
        Map<Integer,Student> accountDto=empDao.getAllEmployees();
        return new ResponseEntity<>(accountDto, HttpStatus.CREATED);
    }

    @PostMapping("/{key}/{value}")
    public ResponseEntity<String> addAccount(@PathVariable String key,@PathVariable  String value){
        empDao.saveValue(key,value);
        return new ResponseEntity<>("accountDto", HttpStatus.CREATED);
    }
    @GetMapping("/{key}")
    public ResponseEntity<String> addAccount(@PathVariable String key){
        String accountDto1=empDao.getValue(key);
        return new ResponseEntity<>(accountDto1, HttpStatus.CREATED);
    }
}
