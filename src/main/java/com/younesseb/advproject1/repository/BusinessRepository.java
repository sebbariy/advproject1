package com.younesseb.advproject1.repository;

import com.younesseb.advproject1.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends JpaRepository<Business,Integer> {
}
