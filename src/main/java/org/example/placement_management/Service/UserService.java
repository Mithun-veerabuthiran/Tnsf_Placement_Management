package org.example.placement_management.Service;

import org.example.placement_management.model.User;
import org.example.placement_management.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//hi
@Service
public class UserService {

    @Autowired
    private Userrepo userRepo;

    // Save or update a user
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    // Get user by ID
    public Optional<User> getUserById(Long id) {
        return userRepo.findById(Math.toIntExact(id));
    }

    // Delete user by ID
    public void deleteUser(Long id) {
        userRepo.deleteById(Math.toIntExact(id));
    }
}
