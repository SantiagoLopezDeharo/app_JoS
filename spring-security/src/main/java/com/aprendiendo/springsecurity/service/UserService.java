package com.aprendiendo.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aprendiendo.springsecurity.model.User;
import com.aprendiendo.springsecurity.repositorios.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder Nono = new BCryptPasswordEncoder(12);

    public User save(User usr)
    {
        usr.setPassword(Nono.encode(usr.getPassword()));   
        repo.save(usr);
        return usr;
    }

}
