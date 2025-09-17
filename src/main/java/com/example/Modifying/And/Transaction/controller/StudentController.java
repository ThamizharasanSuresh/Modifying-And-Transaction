package com.example.Modifying.And.Transaction.controller;

import com.example.Modifying.And.Transaction.entity.Student;
import com.example.Modifying.And.Transaction.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    StudentService studentService;

    @PostMapping
    public String addstd(@RequestBody Student student){
        studentService.addstd(student);
        return "Added....";
    }


    @PutMapping("/{id}/name")
    public String updateName(@PathVariable Long id, @RequestParam String name) {
        studentService.changeStudentName(id, name);
        return "Student name updated successfully!";
    }

    @DeleteMapping("/delete")
    public String deleteByEmail(@RequestParam String email) {
        studentService.removeStudentByEmail(email);
        return "Student deleted successfully!";
    }
}
