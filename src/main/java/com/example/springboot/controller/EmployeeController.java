package com.example.springboot.controller;

import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Abdulakhad on 06.02.2022
 * @project spring-boot
 */
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity create(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(employeeService.getAll());
    }


    @GetMapping("/withname")
    public ResponseEntity findName(@RequestParam String name) {
        return ResponseEntity.ok(employeeService.findByName(name));
    }

    @GetMapping("/withnameandlast")
    public ResponseEntity findNameAndLastName(@RequestParam String name, @RequestParam String lastName) {
        return ResponseEntity.ok(employeeService.findByNameAndLast(name, lastName));
    }

    @GetMapping("/search")
    public ResponseEntity findNameLike(@RequestParam String name) {
        return ResponseEntity.ok(employeeService.findAllBySeach(name));
    }
}
