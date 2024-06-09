package com.example.test0608.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test0608.entity.Enrollment;
import com.example.test0608.entity.Student;
import com.example.test0608.entity.Subject;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment,Integer>{
    Optional<Enrollment> findBySidAndSno(Student sid, Subject sno);
}
