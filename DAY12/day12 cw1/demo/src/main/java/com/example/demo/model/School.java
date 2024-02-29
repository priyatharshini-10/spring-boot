package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;

// import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String schoolname;
    @OneToMany(mappedBy = "school",cascade=CascadeType.ALL)
    private List<Student> students;

    
}

