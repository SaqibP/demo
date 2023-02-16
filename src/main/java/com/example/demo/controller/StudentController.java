package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

// Dependency Injection

    @Autowired
    private StudentRepo studentRepo;

// Create Id

    @PostMapping
    public void saveId(@RequestBody Student student) {
        studentRepo.save(student);
    }


    // Read One Id

    @GetMapping("/{student_id}")
    public Optional<Student> getbyId(@PathVariable("student_id") Long id){
        Optional<Student> studentId = studentRepo.findById(id);
        return studentId;
    }

    // Read All Id

    @GetMapping("getAll")
    public List<Student> getAllId(){
        List<Student> id = studentRepo.findAll();
        return id;
    }

// Delete One Id

    @DeleteMapping ("/{student_id}")
    public void deleteId(@PathVariable("student_id") Long id){
        studentRepo.deleteById(id);
    }

// Delete All Id

    @DeleteMapping ("deleteAll")
    public void deleteAll(){
        studentRepo.deleteAll();
    }

    // Update Id
    
    @PutMapping("/{student_id}")
    public void updateById( @RequestBody Student student) {
      studentRepo.save(student);
    }

}
