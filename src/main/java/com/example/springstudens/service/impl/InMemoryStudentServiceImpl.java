package com.example.springstudens.service.impl;

import com.example.springstudens.model.Student;
import com.example.springstudens.service.StudentsService;

import java.util.List;

public class InMemoryStudentServiceImpl implements StudentsService {
    @Override
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Artem").email("Arurur@fgdg.ru").age(20).build(),
                Student.builder().firstName("Saha").email("Saha@fgdg.ru").age(19).build()

        );
    }
}
