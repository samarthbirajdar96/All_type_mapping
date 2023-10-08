package com.example.All_type_mapping.Repo;

import com.example.All_type_mapping.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
