package com.example.test0608.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test0608.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
