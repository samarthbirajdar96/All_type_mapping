package com.example.All_type_mapping.Service;

import com.example.All_type_mapping.Model.Laptop;
import com.example.All_type_mapping.Repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    LaptopRepo laptopRepo;

    public String addlaptop(Laptop mylaptop) {
        laptopRepo.save(mylaptop);
        return "added";
    }

    public List<Laptop> getalllaptops() {
       return laptopRepo.findAll();
    }

    public String  updatelaptopbyid(Long id, String name) {
        Laptop mylaptop=laptopRepo.findById(id).orElse(null);
        if(mylaptop!=null){
            mylaptop.setLaptopName(name);
            laptopRepo.save(mylaptop);
            return "update";

        }else{
            return null;
        }

    }

    public String deletebyid(Long id) {
        laptopRepo.deleteById(id);
        return "deleted";
    }
}
