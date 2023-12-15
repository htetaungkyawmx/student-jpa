package com.example.studentjpa.dao;

import com.example.studentjpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
