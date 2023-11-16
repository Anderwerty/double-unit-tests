package org.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class ServiceTest {
    private final Service service = new Service();

    @Nested
    class FindMethods {
        @Test
        void findUserShouldReturnUser() {
            User expected = new User("Alex", "Shevchenko");
            User actual = service.findUser();

            assertEquals(expected, actual);
            assertUsers(expected, actual);
        }
    }

    @Test
    void findUserShouldReturnUser() {
        User expected = new User("Alex", "Shevchenko");
        User actual = service.findUser();

        assertEquals(expected, actual);
        assertUsers(expected, actual);
    }

    private static void assertUsers(User expected, User actual) {
        Assertions.assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(expected.getName(), actual.getName(), "name message"),
                () -> assertEquals(expected.getSurname(), actual.getSurname())
        );

        Duration timeout = null;
        Assertions.assertTimeout(timeout, () ->{});

    }

}