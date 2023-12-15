package com.example.studentjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String school;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToOne
    private Province province;
    @OneToMany(mappedBy = "student")
    private List<StudentSubject> studentSubjects=
            new ArrayList<>();

    public void
    addStudentSubject(StudentSubject studentSubject){
        studentSubject.setStudent(this);
        studentSubjects.add(studentSubject);
    }

    public Student(String name, int age, String school, Gender gender) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.gender = gender;
    }

}

