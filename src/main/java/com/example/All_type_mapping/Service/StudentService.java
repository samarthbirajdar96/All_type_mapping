package com.example.All_type_mapping.Service;

import com.example.All_type_mapping.Model.Student;
import com.example.All_type_mapping.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public String addstudent(Student mystudent) {

        studentRepo.save(mystudent);
        return "added";
    }

    public List<Student> getallstudents() {
        return studentRepo.findAll();

    }

    public String updatestudentbyid(Long id, String name) {

        Student mystudent=studentRepo.findById(id).orElse(null);
        if(mystudent!=null){
            mystudent.setStudentName(name);
            studentRepo.save(mystudent);
            return "update";

        }else{
            return  null;
        }
    }

    public String deletebyid(Long id) {
        studentRepo.deleteById(id);
        return "deleted";
    }
}
