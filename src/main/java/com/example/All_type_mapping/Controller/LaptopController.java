package com.example.All_type_mapping.Controller;

import com.example.All_type_mapping.Model.Course;
import com.example.All_type_mapping.Model.Laptop;
import com.example.All_type_mapping.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")

    public String addlaptop(@RequestBody Laptop mylaptop){
        return  laptopService.addlaptop(mylaptop);
    }

    @GetMapping("laptops")
    public List<Laptop> getalllaptops(){
        return laptopService.getalllaptops();
    }

    @PutMapping("laptop/id/{id}")
    public String  updatelaptopbyid(@PathVariable Long id,@RequestParam String name){
        return laptopService.updatelaptopbyid(id,name);
    }

    @DeleteMapping("laptop/id/{id}")
    public String deletebyid(@PathVariable Long id){
        return laptopService.deletebyid(id);
    }


}
