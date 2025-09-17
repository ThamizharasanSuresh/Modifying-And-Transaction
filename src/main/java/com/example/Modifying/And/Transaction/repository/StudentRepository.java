package com.example.Modifying.And.Transaction.repository;


import com.example.Modifying.And.Transaction.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // update student name by id
    @Modifying
    @Transactional
    @Query("UPDATE Student s SET s.name = :name WHERE s.id = :id")
    int updateStudentNameById(Long id, String name);

    // delete student by email
    @Modifying
    @Transactional
    @Query("DELETE FROM Student s WHERE s.email = :email")
    int deleteByEmail(String email);
}
