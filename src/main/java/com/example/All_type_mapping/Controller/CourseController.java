package com.example.All_type_mapping.Controller;

import com.example.All_type_mapping.Model.Book;
import com.example.All_type_mapping.Model.Course;
import com.example.All_type_mapping.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;


    @PostMapping("course")

    public String addcourse(@RequestBody Course mycourse){
        return  courseService.addcourse(mycourse);
    }

    @GetMapping("course")
    public List<Course> getallcourse(){
        return courseService.getallcourse();
    }

    @PutMapping("course/id/{id}")
    public String updatecoursebyid(@PathVariable Long id,@RequestParam String title){
        return courseService.updatecoursebyid(id,title);
    }

    @DeleteMapping("course/id/{id}")
    public String deletebyid(@PathVariable Long id){
        return courseService.deletebyid(id);
    }
}
