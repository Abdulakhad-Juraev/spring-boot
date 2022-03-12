package com.example.springboot.controller;

import com.example.springboot.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abdulakhad on 06.02.2022
 * @project spring-boot
 */
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public ResponseEntity hello() {
        Student student1 = new Student(1L, "Name", "name", "web");
        Student student2 = new Student(1L, "Name", "name", "web");
        Student student3 = new Student(1L, "Name", "name", "web");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return ResponseEntity.ok(students);
    }

    @GetMapping("/param")
    public ResponseEntity paramet(
            @RequestParam Long id,
            @RequestParam String name,
            @RequestParam String lastName,
            @RequestParam String course
    ) {
        Student student = new Student(id, name, lastName, course);
        return ResponseEntity.ok(student);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String hello2() {
        return "Salom";
    }


}
