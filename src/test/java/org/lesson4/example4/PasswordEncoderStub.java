package org.lesson4.example4;

import org.lesson4.PasswordEncoder;

import java.util.Objects;

class PasswordEncoderStub implements PasswordEncoder {
    @Override
    public String encode(String rawPassword) {
        return rawPassword;
    }

    @Override
    public boolean match(String rawPassword, String encodedPassword) {
        System.out.println("invoke match method");
        if(rawPassword.equals("1") && encodedPassword.equals("2")){
            throw new RuntimeException();
        }
        return false;
    }
}

