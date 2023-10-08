package com.example.All_type_mapping.Controller;

import com.example.All_type_mapping.Model.Laptop;
import com.example.All_type_mapping.Model.Student;
import com.example.All_type_mapping.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")

    public String addstudent(@RequestBody Student mystudent){
        return  studentService.addstudent(mystudent);
    }

    @GetMapping("students")
    public List<Student> getallstudents(){
        return studentService.getallstudents();
    }

    @PutMapping("student/id/{id}")
    public String updatestudentbyid(@PathVariable Long id,@RequestParam String name){
        return studentService.updatestudentbyid(id,name);
    }

    @DeleteMapping("student/id/{id}")
    public String deletebyid(@PathVariable Long id){
        return studentService.deletebyid(id);
    }


}
