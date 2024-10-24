package spring_react_jwt.spring_boot_jwt.service;

import spring_react_jwt.spring_boot_jwt.entity.User;

import java.util.Optional;

public interface UserService {
    Optional <User> findByUsername(String username);

    User saveUser(User user);

}
