package com.example.studentjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StudentSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int marks;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Subject subject;
}
