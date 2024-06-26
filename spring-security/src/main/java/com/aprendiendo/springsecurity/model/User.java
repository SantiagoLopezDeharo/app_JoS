package com.aprendiendo.springsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class User 
{
    @Id
    private Integer id;
    private String username;
    private String password;    

    public String toString()
    {
        return String.valueOf(id) + " : " + username;
    }
}
