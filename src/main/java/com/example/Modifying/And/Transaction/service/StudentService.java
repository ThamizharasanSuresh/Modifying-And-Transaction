package com.example.Modifying.And.Transaction.service;


import com.example.Modifying.And.Transaction.entity.Student;
import com.example.Modifying.And.Transaction.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepo;

    public void changeStudentName(Long id, String newName) {
        studentRepo.updateStudentNameById(id, newName);
    }

    public void removeStudentByEmail(String email) {
        studentRepo.deleteByEmail(email);
    }

    public void addstd(Student student) {
        studentRepo.save(student);
    }
}
