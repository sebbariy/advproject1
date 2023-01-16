package com.younesseb.advproject1.controller;

import com.younesseb.advproject1.model.Student;
import com.younesseb.advproject1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New school is added";
    }
    @GetMapping("/getAllStudents")
    public List<Student> list(){
        return studentService.getAllStudents();
    }
    @GetMapping("/{schoolid}")
    public Optional<Student> getStudentById(@PathVariable int schoolid){
        return studentService.getStudentById(schoolid);
    }

    @PutMapping("/{schoolid}")
    public Student updateStudent(@PathVariable int schoolid, @RequestBody Student student){
        return studentService.updateStudent(schoolid, student);
    }

    @DeleteMapping("/{schoolid}")
    public void deleteStudent(@PathVariable int schoolid){
        studentService.deleteStudent(schoolid);
    }
}