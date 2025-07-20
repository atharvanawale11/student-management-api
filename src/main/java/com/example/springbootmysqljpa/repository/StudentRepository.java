package com.example.springbootmysqljpa.repository;

import com.example.springbootmysqljpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can define custom queries here later if needed
}
