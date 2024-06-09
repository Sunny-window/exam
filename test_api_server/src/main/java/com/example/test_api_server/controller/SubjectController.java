package com.example.test_api_server.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test_api_server.dto.EnrollDto;
import com.example.test_api_server.entity.Enrollment;
import com.example.test_api_server.entity.Student;
import com.example.test_api_server.entity.Subject;
import com.example.test_api_server.repository.EnrollmentRepository;
import com.example.test_api_server.repository.SubjectRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class SubjectController {
    @Autowired
    SubjectRepository sr;

    @Autowired
    EnrollmentRepository er;

    @GetMapping("/subjects/{sid}")
    public List<Subject> getSubjects(@PathVariable("sid") Integer sid) {
        return sr.getSubjectAllByStudent(sid);
    }

    @GetMapping("/subject-all")
    public List<Subject> getAllSubjects() {
        return sr.findAll();
    }

    @PostMapping("/enrollment")
    public String enrollment(@RequestBody EnrollDto dto) {
        Enrollment enrollment = new Enrollment();
        Student s = new Student();
        Subject sbj = new Subject();
        s.setSid(dto.getSid());
        sbj.setSno(dto.getSno());
        enrollment.setSid(s);
        enrollment.setSno(sbj);
        System.out.println("sid = " + enrollment.getSid() + ", sno = " + enrollment.getSno());
        Optional<Enrollment> e = er.findBySidAndSno(enrollment.getSid(), enrollment.getSno());
        if (e.isPresent()) {
            return "이미 수강 신청한 항목";
        } else {
            er.save(enrollment);
            return "수강 신청 등록 완료";
        }
    }
}
