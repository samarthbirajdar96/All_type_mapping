package com.example.All_type_mapping.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseID;
    private String courseTitle;
    private String courseDescription;
    private String courseDuration;

    @ManyToMany(mappedBy = "courses")

    List<Student> student;
}
