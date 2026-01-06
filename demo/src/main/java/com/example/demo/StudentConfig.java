package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
           Student shelton = new Student(
                "Shelton",
                "Sheltonjose@gmail.com",
                LocalDate.of(2003, Month.DECEMBER, 2)
               
            );

            Student Kevin =  new Student(
                "Kevin",
                "Kevindebruyne@gmail.com",
                LocalDate.of(2004, Month.JANUARY, 22)
               
            );

            Student Rayan = new Student(
                "Rayan",
                "rayancherki@gmail.com",
                LocalDate.of(2000, Month.JANUARY,20)
                

            );

            Student Erling = new Student(
                "Erling",
                "erlinghalland@gmail.com",
                LocalDate.of(2000, Month.JULY,20)
                
            );

            Student pablo = new Student(
                "pablo",
                "pablogavi@gmail.com",
                LocalDate.of(2005, Month.APRIL, 11)

            );

            Student omar = new Student(
                "omar",
                "omarmarmoush@gmail.com",
                LocalDate.of(1997, Month.SEPTEMBER, 18)

            );

            Student ruben = new Student(
                "ruben",
                "rubendias@gmail.com",
                LocalDate.of(1998, Month.MAY, 16)
            );


            
            repository.saveAll(
                List.of(shelton,Kevin,Rayan,Erling,pablo,omar,ruben)
            );








        };
    }
    



}
