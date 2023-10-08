package com.example.All_type_mapping.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long laptopID;
    private String laptopName;
    private String laptopBrand;
    private Integer laptopPrice;

    @OneToOne(mappedBy = "laptop")
    private Student student;

}
