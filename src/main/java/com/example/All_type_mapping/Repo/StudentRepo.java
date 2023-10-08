package com.example.All_type_mapping.Repo;

import com.example.All_type_mapping.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
