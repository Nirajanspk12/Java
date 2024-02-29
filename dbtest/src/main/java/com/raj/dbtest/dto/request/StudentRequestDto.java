package com.raj.dbtest.dto.request;

public class StudentRequestDto {
    private String name;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public StudentRequestDto(Integer studentId) {
        this.studentId = studentId;
    }

    private Integer studentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentRequestDto(String name) {
        this.name = name;
    }
}

