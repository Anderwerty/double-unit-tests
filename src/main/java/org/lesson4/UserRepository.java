package org.lesson4;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Integer id);

    List<User> findAll();

    Optional<User> findByEmail(String email);
}
