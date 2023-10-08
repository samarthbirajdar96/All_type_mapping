package com.example.All_type_mapping.Repo;

import com.example.All_type_mapping.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
