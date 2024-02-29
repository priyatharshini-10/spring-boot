package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.School;
import com.example.demo.repository.SchoolRepository;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;
    
      @SuppressWarnings("null")
    public School create(School school){
            return schoolRepository.save(school);
      }
      public List<School> getAllStudents(){
        return schoolRepository.findAll();
      }
      public School getSchoolid(int school_id){
        return schoolRepository.findById(school_id).orElse(null);
      }
}