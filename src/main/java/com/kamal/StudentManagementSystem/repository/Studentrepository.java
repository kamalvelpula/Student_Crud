package com.kamal.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamal.StudentManagementSystem.entity.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer>{

}
