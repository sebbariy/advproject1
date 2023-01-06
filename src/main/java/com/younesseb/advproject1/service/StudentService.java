package com.younesseb.advproject1.service;

import com.younesseb.advproject1.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public Optional<Student> getStudentById(int schoolid);
    public List<Student> getAllStudents();
    Student updateStudent(int schoolid,Student student);
    void deleteStudent(int schoolid);
}