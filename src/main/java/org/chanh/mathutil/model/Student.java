/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.chanh.mathutil.model;

/**
 *
 * @author Triệu
 */
public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private int age;
    private String phoneNumber;

    public Student() {
    }

    public Student(String firstName, String lastName, int id, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (id<0) {
            this.id=0;
        } else this.id = id;     
        if (age<0) {
            this.age=0;
        } else this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<0) {
            this.id=0;
        } else this.id = id; 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            this.age=0;
        } else this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
