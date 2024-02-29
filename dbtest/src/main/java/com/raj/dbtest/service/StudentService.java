package com.raj.dbtest.service;
import com.raj.dbtest.dto.request.StudentRequestDto;
import com.raj.dbtest.dto.response.StudentResponseDto;

public interface StudentService {

    StudentResponseDto saveStudent(StudentRequestDto std) throws Exception;
}
