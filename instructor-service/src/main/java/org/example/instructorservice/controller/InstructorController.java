package org.example.instructorservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.instructorservice.entity.Instructor;
import org.example.instructorservice.service.InstructorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/instructors")
@RequiredArgsConstructor
public class InstructorController {
    private final InstructorService instructorService;

    @GetMapping("/{id}")
    public ResponseEntity<?> showInstructor(@PathVariable Long id) {
        Optional<Instructor> instructorOptional = instructorService.findById(id);
        if (instructorOptional.isPresent()) {
            return ResponseEntity.ok(instructorOptional.get());
        }
        Map<String, Object> errorResponse = new LinkedHashMap<>();
        errorResponse.put("status", HttpStatus.NOT_FOUND.value());
        errorResponse.put("message", "instructorId không tồn tại");
        errorResponse.put("error", "Not Found");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
}

