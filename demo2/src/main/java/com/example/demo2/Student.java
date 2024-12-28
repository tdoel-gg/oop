package com.example.demo2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.experimental.Accessors;

import java.util.UUID;

@Entity
@Table(name = "student")
@Accessors(chain = true)
public class Student {

    @Id
    @Column(nullable = false, unique = true, name = "stud_id")
    private UUID stud_id;

    @Column(nullable = false, name = "stud_surname")
    private String stud_surname;

    @Column(nullable = false, name = "stud_name")
    private String stud_name;


    public UUID getStud_id() {
        return this.stud_id;
    }

    public String getStud_surname() {
        return this.stud_surname;
    }

    public String getStud_name() {
        return this.stud_name;
    }

    public Student setStud_id(UUID stud_id) {
        this.stud_id = stud_id;
        return this;
    }

    public Student setStud_surname(String stud_surname) {
        this.stud_surname = stud_surname;
        return this;
    }

    public Student setStud_name(String stud_name) {
        this.stud_name = stud_name;
        return this;
    }
}