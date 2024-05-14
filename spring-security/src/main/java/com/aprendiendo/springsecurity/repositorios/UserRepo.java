package com.aprendiendo.springsecurity.repositorios;
import com.aprendiendo.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>
{
    User findByUsername(String username);
}
