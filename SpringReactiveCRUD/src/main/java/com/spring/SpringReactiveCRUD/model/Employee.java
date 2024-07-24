package com.spring.SpringReactiveCRUD.model;


import org.springframework.data.annotation.Id;
import javax.persistence.Column;
import  javax.persistence.Entity;
import  javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Employee(Integer id,String name, String emailId,String designation,Integer age){
        super();
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.designation = designation;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name = "email_id")
    private String emailId;
    private String designation;
    private Integer age;


}
