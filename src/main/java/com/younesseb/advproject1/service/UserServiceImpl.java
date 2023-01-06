package com.younesseb.advproject1.service;

import com.younesseb.advproject1.model.User;
import com.younesseb.advproject1.repository.StudentRepository;
import com.younesseb.advproject1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(int userid) {
        return userRepository.findById(userid);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(int userid, User user) {
        User userToUpdate = userRepository.findById(userid).orElseThrow();
        userToUpdate.setAuth(user.getAuth());
        userToUpdate.setRole(user.getRole());
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setUsername(user.getUsername());
        return userRepository.save(userToUpdate);
    }


    @Override
    public void deleteUser(int userid) {
        userRepository.deleteById(userid);
    }

    @Override
    public User getUserByUserName(String username) {
        return userRepository.findByUserName(username);
    }

}
