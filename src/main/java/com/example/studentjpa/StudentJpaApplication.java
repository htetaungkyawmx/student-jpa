package com.example.studentjpa;

import com.example.studentjpa.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentJpaApplication implements CommandLineRunner {

    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(StudentJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentService.createDb();
        JPAUtil.checkData("select * from province");
        JPAUtil.checkData("select * from student");
        JPAUtil.checkData("select * from subject");
        JPAUtil.checkData("select * from student_subject");

    }
}
