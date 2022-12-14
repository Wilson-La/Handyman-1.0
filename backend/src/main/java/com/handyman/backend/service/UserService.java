package com.handyman.backend.service;

import com.handyman.backend.model.Role;
import com.handyman.backend.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
