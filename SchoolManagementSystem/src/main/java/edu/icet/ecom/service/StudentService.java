package edu.icet.ecom.service;

import edu.icet.ecom.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();


    void addStudent(Student student);

    void search(Integer id);
}
