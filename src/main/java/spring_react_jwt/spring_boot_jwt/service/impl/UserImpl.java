package spring_react_jwt.spring_boot_jwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_react_jwt.spring_boot_jwt.entity.User;
import spring_react_jwt.spring_boot_jwt.repository.UserRepo;
import spring_react_jwt.spring_boot_jwt.service.UserService;

import java.util.Optional;

@Service
public class  UserImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
