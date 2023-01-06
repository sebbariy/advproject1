package com.younesseb.advproject1.repository;

import com.younesseb.advproject1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("select u from User u where u.username = ?1")
    User findByUserName(String username);
}
