package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class StudentService {

    @RequestMapping
	public List<Student> getStudents(){
		return List.of(
            new Student(
                1L,
                "Shelton idília Joaquim José",
                "sheltonjose02@gmail.com",
                LocalDate.of(2003, Month.DECEMBER, 2),
                22

            )
        );
	}
   
   





}
