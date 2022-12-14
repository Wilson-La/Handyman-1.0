package com.handyman.backend.service;

import com.handyman.backend.model.Role;
import com.handyman.backend.model.User;
import com.handyman.backend.repository.RoleRepository;
import com.handyman.backend.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    private final UserRepository userRepo;
    private final RoleRepository roleRepo;

    public UserServiceImpl(UserRepository userRepo, RoleRepository roleRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
