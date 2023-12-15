package com.example.studentjpa.service;

import com.example.studentjpa.dao.ProvinceDao;
import com.example.studentjpa.dao.StudentDao;
import com.example.studentjpa.dao.SubjectDao;
import com.example.studentjpa.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final SubjectDao subjectDao;
    private final ProvinceDao provinceDao;
    private final StudentDao studentDao;

    @Transactional
    public void createDb(){
        Province province=new Province();
        province.setProvinceName("Sule");

        Province province1=new Province();
        province1.setProvinceName("Haling");

        Student student1=new Student("MX",19,"ISM", Gender.M);
        Student student2=new Student("Neo",19,"ISY", Gender.M);
        Student student3=new Student("Mary",20,"GED", Gender.F);
        Student student4=new Student("Cathy",20,"IG", Gender.F);
        Student student5=new Student("Cgo",21,"KMD", Gender.M);
        Student student6=new Student("Xig",21,"MUF", Gender.F);

        Subject subject1=new Subject("Java",200,6);
        Subject subject2=new Subject("Python",100,6);
        Subject subject3=new Subject("Angular",200,3);
        Subject subject4=new Subject("Ruby",100,6);
        Subject subject5=new Subject("TypeScript",200,6);
        Subject subject6=new Subject("kotlin",100,6);
        Subject subject7=new Subject("Dart",200,3);


        //mapping
        province.addStudent(student1);
        province.addStudent(student2);
        province.addStudent(student3);

        province1.addStudent(student4);
        province1.addStudent(student5);
        province1.addStudent(student6);

        StudentSubject studentSubject1=new StudentSubject();
        studentSubject1.setMarks(90);
        student1.addStudentSubject(studentSubject1);
        subject1.addStudentSubject(studentSubject1);

        StudentSubject studentSubject2=new StudentSubject();
        studentSubject2.setMarks(80);
        student1.addStudentSubject(studentSubject2);
        subject2.addStudentSubject(studentSubject2);

        StudentSubject studentSubject3=new StudentSubject();
        studentSubject3.setMarks(70);
        student2.addStudentSubject(studentSubject3);
        subject3.addStudentSubject(studentSubject3);


        provinceDao.save(province1);
        provinceDao.save(province);
        studentDao.save(student1);
        studentDao.save(student2);
        studentDao.save(student3);
        studentDao.save(student4);
        studentDao.save(student5);
        studentDao.save(student6);
        subjectDao.save(subject1);
        subjectDao.save(subject2);
        subjectDao.save(subject3);
        subjectDao.save(subject4);
        subjectDao.save(subject5);
        subjectDao.save(subject6);
        subjectDao.save(subject7);

    }

}
