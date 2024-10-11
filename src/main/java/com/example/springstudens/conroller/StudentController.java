package com.example.springstudens.conroller;

import com.example.springstudens.model.Student;
import com.example.springstudens.service.StudentsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentsService service;

    @GetMapping
    //todo
    public List<Student> findAllStudent() {
        return service.findAllStudent();
    }
}
