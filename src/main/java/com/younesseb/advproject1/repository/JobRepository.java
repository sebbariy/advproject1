package com.younesseb.advproject1.repository;

import com.younesseb.advproject1.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {

}
