package com.younesseb.advproject1.service;

import com.younesseb.advproject1.model.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User saveUser(User user);
    public Optional<User> getUserById(int userid);
    public List<User> getAllUsers();
    User updateUser(int userid, User user);
    void deleteUser(int userid);

    @Query("SELECT user FROM User u WHERE u.username = ?1")
    public User getUserByUserName(String username);
}
