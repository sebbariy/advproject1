package com.younesseb.advproject1.service;

import com.younesseb.advproject1.model.Student;
import com.younesseb.advproject1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(int schoolid) {
        return studentRepository.findById(schoolid);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(int schoolid, Student student) {
        Student studentToUpdate = studentRepository.findById(schoolid).orElseThrow();
        studentToUpdate.setType(student.getType());
        studentToUpdate.setSchoolImg(student.getSchoolImg());
        studentToUpdate.setSchoolname(student.getSchoolname());
        studentToUpdate.setLocation(student.getLocation());
        studentToUpdate.setLink(student.getLink());
        studentToUpdate.setDescription(student.getDescription());
        return studentRepository.save(studentToUpdate);
    }

    @Override
    public void deleteStudent(int schoolid) {
        studentRepository.deleteById(schoolid);
    }
}