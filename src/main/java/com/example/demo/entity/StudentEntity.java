package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GeneratedValue.IDENTITY)
    private Long Id;
    private String name;
    private String email;
    private float cgpa;

}
