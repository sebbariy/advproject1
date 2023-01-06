package com.younesseb.advproject1.repository;

import com.younesseb.advproject1.model.Tourism;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourismRepository extends JpaRepository<Tourism,Integer> {
}
