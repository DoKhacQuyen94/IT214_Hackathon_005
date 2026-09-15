package org.example.instructorservice;

import lombok.RequiredArgsConstructor;
import org.example.instructorservice.repository.InstructorRepository;
import org.example.instructorservice.service.InstructorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class InstructorServiceApplication implements CommandLineRunner {
    private final InstructorService instructorService;
    public static void main(String[] args) {
        SpringApplication.run(InstructorServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        instructorService.initializeInstructors();
    }

}
