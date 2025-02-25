package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Student;
import edu.icet.ecom.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {
    @Override
    public List<Student> getAll() {
        return List.of();
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void search(Integer id) {

    }
}
