package com.example.test0608.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test0608.entity.Student;
import com.example.test0608.repository.StudentRepository;

@RestController
public class StudentController {

    @Autowired
    StudentRepository sr;
    
    @GetMapping("/student-all")
    public List<Student> studentAll() {
        return sr.findAll();
    }
}
