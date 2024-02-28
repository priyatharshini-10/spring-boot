package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    private int personid;
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    public Person(){
        
    }
    public Person(int personid, String firstname, String lastname, int age, String gender) {
        this.personid = personid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }
    public int getPersonid() {
        return personid;
    }
    public void setPersonid(int personid) {
        this.personid = personid;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    

}