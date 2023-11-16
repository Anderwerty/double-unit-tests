package org.lesson4.example3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.lesson4.PasswordEncoder;
import org.lesson4.User;
import org.lesson4.UserRepository;
import org.lesson4.UserService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceWithMockitoTest {
    private static final String EMAIL = "example@gmail.com";
    private static final String PASSWORD = "password";

    @Mock
    UserRepository userRepository;

    @Mock
    PasswordEncoder passwordEncoder;

    @InjectMocks
    UserService userService;

    @Test
    void loginShouldReturnTrueIfUserWithSuchPasswordExist() {

        when(userRepository.findByEmail(EMAIL)).thenReturn(Optional.of(new User().setEmail(EMAIL).setPassword(PASSWORD)));
//        when(passwordEncoder.match(PASSWORD, PASSWORD)).thenReturn(true);
        when(passwordEncoder.match(any(), any())).thenReturn(true);

        boolean isLogin = userService.login(PASSWORD, EMAIL);

        assertTrue(isLogin);
    }


}
