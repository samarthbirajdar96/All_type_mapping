package com.example.All_type_mapping.Repo;

import com.example.All_type_mapping.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {
}
