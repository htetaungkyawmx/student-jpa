package com.example.studentjpa.dao;

import com.example.studentjpa.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectDao extends JpaRepository<Subject,Integer> {

}
