package com.example.demo.Service;

import com.example.demo.model.Users;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder encoder;


    public Users register(Users user)
    {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);
        return user;
    }
}
