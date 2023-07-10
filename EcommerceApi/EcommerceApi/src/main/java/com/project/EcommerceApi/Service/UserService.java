package com.project.EcommerceApi.Service;

import com.project.EcommerceApi.Model.User;
import com.project.EcommerceApi.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public Iterable<User> getAllUser() {
        return userRepo.findAll();
    }

    public String createUser(User user) {
         userRepo.save(user);
        return"User Saved";
    }

    public Optional<User> getUserByUserId(Long userId) {
        return userRepo.findById(userId);
    }
}
