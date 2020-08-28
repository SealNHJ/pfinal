package com.uabc.edu.pfinal.demo.service.security;

import com.uabc.edu.pfinal.demo.entity.security.UserSecurity;

public interface UserService {
    void save(UserSecurity userSecurity);

    UserSecurity findByUsername(String username);
}
