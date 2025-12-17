package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String email;
    private float cgpa;

}


public void setName(String name){
    this.name=name;
}
public String getName(){
    return this.name;
}
public void setEmail(String Email){
    this.email=email;
}
public String getEmail(){
    return this.email;
}
public void setCgpa(String Cgpa){
    this.cgpa=cgpa;
}
public String getCgpa(){
    return this.cgpa;
}
public void setId(String Id){
    this.id=id;
}
public String getId(){
    return this.id;
}