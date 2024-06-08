package com.example.test0608.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.test0608.entity.Subject;
import com.example.test0608.repository.SubjectRepository;

@RestController
public class SubjectController {
    @Autowired
    SubjectRepository sr;

    @GetMapping("/subjects/{sid}")
    public List<Subject> getSubjects(@PathVariable("sid") Integer sid) {
        return sr.getSubjectAllByStudent(sid);
    }
}
