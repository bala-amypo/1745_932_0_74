package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity{
    private Long Id;
    private String name;
    private String email;
    private float cgpa;

}
