package com.termproj.Flitey.service.impl;

import com.termproj.Flitey.model.User;
import com.termproj.Flitey.repository.UserRepository;
import com.termproj.Flitey.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "User saved in repo";
    }


    @Override
    public String updateMem(int userId) {
        Optional<User> userOptional = userRepository.findById(userId);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setIsmember(true);
            userRepository.save(user);
            return "Membership status updated for user";
        } else {
            return "User not found with ID: " + userId;
        }
    }

    @Override
    public User getUser(int userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }
}
