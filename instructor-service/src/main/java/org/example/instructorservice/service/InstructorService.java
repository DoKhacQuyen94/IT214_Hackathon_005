package org.example.instructorservice.service;

import lombok.RequiredArgsConstructor;
import org.example.instructorservice.entity.Instructor;
import org.example.instructorservice.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public Optional<Instructor> findById(Long id) {
        return instructorRepository.findById(id);
    }

    public void initializeInstructors() {
        if (instructorRepository.count() == 0) {
            Instructor instructor = Instructor
                    .builder()
                    .instructorId(1L)
                    .instructorName("John")
                    .instructorEmail("join@hhh.com")
                    .instructorPhone("02020200202")
                    .build();
            instructorRepository.save(instructor);
        }
    }

}
