package com.raj.dbtest.service.imple;

import com.raj.dbtest.entity.Address;
import com.raj.dbtest.repository.AddressRepo;
import com.raj.dbtest.repository.StudentRepo;
import com.raj.dbtest.dto.request.StudentRequestDto;
import com.raj.dbtest.dto.response.StudentResponseDto;
import com.raj.dbtest.entity.Student;
import com.raj.dbtest.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService {
    private final StudentRepo studentRepo;




    private final AddressRepo addressRepo;
    public StudentServiceImplementation(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    //Construction INjection -->> more secure
    //DTO
    //Keep the properties in pojo that we take input from user or that we've to show to user.
    public StudentServiceImplementation(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;

    }

    @Override
    public StudentResponseDto saveStudent(StudentRequestDto std) throws Exception {
        Student student = new Student();

        student.setName(std.getName());
        Address address =addressRepo.getById(std.getStudentId());
         if(address==null) {
             throw new Exception("Id not present");
}

        Student savedStudent = studentRepo.save(student);

        StudentResponseDto studentResponseDto = new StudentResponseDto(savedStudent);
        return studentResponseDto;
    }
}
