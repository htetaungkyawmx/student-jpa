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
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subjectName;
    private int cost;
    private int durationMonth;
    @OneToMany(mappedBy = "subject")
    private List<StudentSubject> studentSubjects=
            new ArrayList<>();
    public void addStudentSubject(StudentSubject studentSubject){
        studentSubject.setSubject(this);
        studentSubjects.add(studentSubject);
    }

    public Subject(String subjectName, int cost, int durationMonth) {
        this.subjectName = subjectName;
        this.cost = cost;
        this.durationMonth = durationMonth;
    }
}
