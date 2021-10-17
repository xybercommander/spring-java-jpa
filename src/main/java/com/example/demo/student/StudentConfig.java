package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student samrat = new Student(
                    "Samrat Mukherjee",
                    "samratmukherjee.sps@gmail.com",
                    LocalDate.of(2001, Month.APRIL, 10)
            );

            Student xyber = new Student(
                    "Xyber Commander",
                    "xybercommandder@gmail.com",
                    LocalDate.of(2001, Month.MAY, 15)
            );

            repository.saveAll(List.of(samrat, xyber));
        };
    }

}
