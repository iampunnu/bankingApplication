package net.praveen.banking.services;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GenerateAccountNo {
    static {
        System.out.println("this is GenerateAccountNo");
    }
    public String genarateRandomString(){
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int)
                (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();
    return generatedString;
    }
}
