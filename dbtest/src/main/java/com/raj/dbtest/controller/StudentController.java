package com.raj.dbtest.controller;

import com.raj.dbtest.dto.request.StudentRequestDto;
import com.raj.dbtest.dto.response.StudentResponseDto;
import com.raj.dbtest.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    @Operation(summary = "Api to save student",description = "this is my api")
    public ResponseEntity<StudentResponseDto> saveStudent(@ModelAttribute StudentRequestDto std) throws Exception {
        System.out.println(std.getName());

        return new ResponseEntity<>(studentService.saveStudent(std), HttpStatus.CREATED);
    }

}
