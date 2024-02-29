package com.raj.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.raj.dbtest.entity.Student;
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
