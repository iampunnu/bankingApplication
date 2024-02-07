package net.praveen.banking;

import net.praveen.banking.services.impl.StaticCheck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApplication {

    public static void main(String[] args) {


        SpringApplication.run(BankingApplication.class, args);
       StaticCheck s=new StaticCheck();
    }

}
