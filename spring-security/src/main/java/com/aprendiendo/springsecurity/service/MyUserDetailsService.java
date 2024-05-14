package com.aprendiendo.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aprendiendo.springsecurity.model.User;
import com.aprendiendo.springsecurity.model.UserPrincipal;
import com.aprendiendo.springsecurity.repositorios.UserRepo;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        User usr = repo.findByUsername(username);
        System.out.println(usr);
        if (usr == null)
        {
            System.out.println("4044444");
            throw new UsernameNotFoundException("404 user not found lmao");
        }
        return new UserPrincipal(usr);
    }
    
}
