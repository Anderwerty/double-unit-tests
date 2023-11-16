package org.lesson4;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserServiceTest {
    UserRepository userRepository = new UserRepositoryStub();
    PasswordEncoder passwordEncoder = new PasswordEncoderStub();
    UserService userService = new UserService(userRepository, passwordEncoder);

    @Test
    void loginShouldReturnTrueIfUserWithSuchPasswordExist() {
        boolean isLogin = userService.login("password", "example@gmail.com");

        assertTrue(isLogin);
    }

    @Test
    void loginShouldReturnFalseIfUserWithSuchEmailsDoesNotExist() {
        boolean isLogin = userService.login("password", "exmapl@gmail.com");

        assertFalse(isLogin);
    }


    @Test
    void loginShouldReturnFalseIfNotCorrectPassword() {
        boolean isLogin = userService.login("wrongPassword", "exmapl@gmail.com");

        assertFalse(isLogin);
    }

}

class PasswordEncoderStub implements PasswordEncoder {
    @Override
    public String encode(String rawPassword) {
        return rawPassword;
    }

    @Override
    public boolean match(String rawPassword, String encodedPassword) {
        return Objects.equals(rawPassword, encodedPassword);
    }
}

class UserRepositoryStub implements UserRepository {

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        if ("example@gmail.com".equals(email)) {
            return Optional.of(new User()
                    .setEmail(email)
                    .setPassword("password"));
        }
        return Optional.empty();
    }
}