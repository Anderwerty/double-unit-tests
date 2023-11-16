package org.lesson4;

public interface PasswordEncoder {
    String encode(String rawPassword);

    boolean match(String rawPassword, String encodedPassword);
}
