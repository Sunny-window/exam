package com.example.test0608.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test0608.entity.Student;
import com.example.test0608.repository.StudentRepository;

@RestController
public class StudentController {

    @Autowired
    StudentRepository sr;
    
    @GetMapping("/students/{sno}")
    public List<Student> getStudents(@PathVariable("sno") Integer sno) {
        return sr.getStudentBySubject(sno);
    }

    @GetMapping("/student-all")
    public List<Student> studentAll() {
        return sr.findAll();
    }

    @GetMapping("/student")
    public Student getStudent(Integer sid){
        Optional<Student> st = sr.findById(sid);
        if(st.isPresent()){
            return st.get();
        }
        else{
            // sid값으로 찾은 student 결과가 없을 때 실행할 코드 
            return null;
        }
    }

    @GetMapping("/student-name")
    public List<Student> getStudentsByName(@RequestParam("name") String name){
        System.out.println("검색어 : " + name);
        
        List<Student> sList = sr.findByName(name);
        System.out.println("리스트 : " + sList);

        return sList;
    }
}
