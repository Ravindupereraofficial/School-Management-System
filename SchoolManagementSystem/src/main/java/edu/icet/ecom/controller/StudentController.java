package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Student;
import edu.icet.ecom.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")

public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/get")
    public List<Student> getAll(){
        return service.getAll();
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }
    @GetMapping("/search/{id}")
    public Student search(@PathVariable Integer Id){
        service.search(Id);
    }


}
