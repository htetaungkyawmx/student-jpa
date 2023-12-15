package com.example.studentjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String provinceName;
    @OneToMany(mappedBy = "province",
    cascade = CascadeType.ALL)
    private List<Student> students=
            new ArrayList<>();

    public void addStudent(Student s){
        s.setProvince(this);
        students.add(s);
    }
}
