package com.example.test_api_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.test_api_server.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Integer>{
    
    @Query(value="SELECT s.* FROM subject s LEFT JOIN  enrollment e ON s.sno = e.sno WHERE e.sid = :sid",nativeQuery = true)
    List<Subject> getSubjectAllByStudent(@Param("sid") Integer sid);
}
