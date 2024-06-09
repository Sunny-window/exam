package com.example.test_api_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.test_api_server.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
    @Query(value="SELECT s.* FROM student s LEFT JOIN enrollment e ON s.sid = e.sid WHERE e.sno = :sno",nativeQuery = true)
    List<Student> getStudentBySubject(@Param("sno") Integer sno);
}
