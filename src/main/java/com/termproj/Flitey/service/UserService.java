package com.termproj.Flitey.service;

import com.termproj.Flitey.model.User;

import java.util.List;

public interface UserService {
    public String createUser(User user);

    public String updateMem(int userId);

    public User getUser(int userId);

    public List<User> getAllUsers();


}
