package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository <Student, Long>{
    
//SELECT * FROM student  where email = ? (qualquer coisa que sera feita o request)

@Query("SELECT s FROM Student s WHERE s.email=?1")
Optional<Student> findStudentByEmail(String email);







}
