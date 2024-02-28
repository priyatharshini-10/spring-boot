package com.example.demo.model;


public class StudentModel {
    private String StudentName;
    private String message;
    
    public StudentModel(String studentName) {
        StudentName = studentName;
        this.message = "Welcome, "+StudentName+"!";
    }
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
    public String getMessage() {
        return message;
    }
    
}