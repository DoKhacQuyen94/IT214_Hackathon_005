package org.example.instructorservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Instructor {
    @Id
    private Long instructorId;
    private String instructorName;
    private String instructorEmail;
    private String instructorPhone;
}
