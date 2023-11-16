package org.lesson4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
class UserServiceWithMockitoTest {
    private static final String EMAIL = "example@gmail.com";
    private static final String PASSWORD = "password";

    private UserRepository userRepository = Mockito.mock(UserRepository.class);
    PasswordEncoder passwordEncoder = Mockito.mock(PasswordEncoder.class);
    UserService userService = new UserService(userRepository, passwordEncoder);

    @Test
    void loginShouldReturnTrueIfUserWithSuchPasswordExist() {
        when(userRepository.findByEmail(EMAIL)).thenReturn(Optional.of(new User().setEmail(EMAIL).setPassword(PASSWORD)));
//        when(passwordEncoder.match(PASSWORD, PASSWORD)).thenReturn(true);
        when(passwordEncoder.match(any(), any())).thenReturn(true);

        boolean isLogin = userService.login(PASSWORD, EMAIL);

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
