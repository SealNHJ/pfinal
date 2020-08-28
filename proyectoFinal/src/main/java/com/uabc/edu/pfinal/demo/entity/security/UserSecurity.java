package com.uabc.edu.pfinal.demo.entity.security;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "User_Security")
public class UserSecurity {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String password;

    public UserSecurity()
    {}

    public UserSecurity(String name, String password)
    {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
