package com.example.test_api_server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test_api_server.entity.Enrollment;
import com.example.test_api_server.entity.Student;
import com.example.test_api_server.entity.Subject;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment,Integer>{
    Optional<Enrollment> findBySidAndSno(Student sid, Subject sno);
}
