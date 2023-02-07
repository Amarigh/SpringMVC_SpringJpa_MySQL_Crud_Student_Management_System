package com.managmentSystem.student.Bean;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {



    @Id
    private String cen;

    @Column(name = "First_name", nullable = false)
    private String firstName;

    @Column(name = "Last_name")
    private String lastName;

    @Column(name = "Email",nullable = false,unique = true)
    private String email;

    public Student(String cen, String firstName, String lastName, String email) {
        this.cen = cen;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {
    }

    public String getCen() {
        return cen;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setCen(String CEN) {
        this.cen = CEN;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cen='" + cen + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
