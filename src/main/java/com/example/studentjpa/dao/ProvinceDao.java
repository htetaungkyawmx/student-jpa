package com.example.studentjpa.dao;

import com.example.studentjpa.entity.Province;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceDao extends JpaRepository<Province,Integer>{

}
