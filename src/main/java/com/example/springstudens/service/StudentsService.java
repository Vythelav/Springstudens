package com.example.springstudens.service;

import com.example.springstudens.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentsService {
    List<Student> findAllStudent();
}
