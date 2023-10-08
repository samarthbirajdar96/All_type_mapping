package com.example.All_type_mapping.Service;

import com.example.All_type_mapping.Model.Course;
import com.example.All_type_mapping.Repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    public String addcourse(Course mycourse) {
        courseRepo.save(mycourse);
        return "added";
    }

    public List<Course> getallcourse() {
        return courseRepo.findAll();
    }

    public String updatecoursebyid(Long id, String title) {
        Course mycourse=courseRepo.findById(id).orElse(null);
        if(mycourse!=null){
            mycourse.setCourseTitle(title);
            courseRepo.save(mycourse);
            return "updated";
        }else{
            return "not found";
        }
    }

    public String deletebyid(Long id) {
        courseRepo.deleteById(id);
        return "deleted";
    }
}
