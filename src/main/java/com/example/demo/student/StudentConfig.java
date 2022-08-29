package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student joe = new Student(
                    "Joe",
                    "joe@gmail.com",
                    LocalDate.of(1984, JANUARY, 10)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1980, FEBRUARY, 23)
            );

            repository.saveAll(
                    List.of(joe, alex)
            );
        };
    }
}
