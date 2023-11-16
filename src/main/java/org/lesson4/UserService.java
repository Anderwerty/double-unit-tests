package org.lesson4;

public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean login(String password, String email) {
        return userRepository.findByEmail(email)
                .filter(user -> passwordEncoder.match(password, user.getPassword()))
                .isPresent();
    }
}

