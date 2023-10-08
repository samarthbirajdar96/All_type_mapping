package com.example.All_type_mapping.Repo;

import com.example.All_type_mapping.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Long> {
}
