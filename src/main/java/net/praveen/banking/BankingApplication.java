package net.praveen.banking;

import net.praveen.banking.entity.Student;
import net.praveen.banking.services.StudentDao;
import net.praveen.banking.services.impl.StaticCheck;
import net.praveen.banking.services.impl.StudentDaoImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class BankingApplication {

    public static void main(String[] args) {


        SpringApplication.run(BankingApplication.class, args);

    }


}
