package com.uabc.edu.pfinal.demo.repository.security;

import com.uabc.edu.pfinal.demo.entity.security.UserSecurity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositorySecurity extends CrudRepository<UserSecurity, Long> {
    UserSecurity findByName(String username);
}
