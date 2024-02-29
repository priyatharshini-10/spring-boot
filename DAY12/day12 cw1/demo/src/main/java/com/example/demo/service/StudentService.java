package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
     @SuppressWarnings("null")
    public Student createstudent(Student student){
            return studentRepository.save(student);
      }
      public List<Student> getAllStudents(){
        return studentRepository.findAll();
      }
      public Student getStudentid(int student_id){
        return ((Optional<Student>) studentRepository.findById(student_id)).orElse(null);
      }

}