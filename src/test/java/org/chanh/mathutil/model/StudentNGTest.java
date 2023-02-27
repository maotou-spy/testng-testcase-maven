/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.chanh.mathutil.model;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Triệu
 */
public class StudentNGTest {
    
    public StudentNGTest() {
    }
    
    @Test()
    public void testSetterIdWithNegativeNumber() {
        Student stu=new Student();
        stu.setId(-10);
        int actual = stu.getId();
        Assert.assertEquals(actual, 0);
    }
    
    @Test()
    public void testSetterAgeWithNegativeNumber() {
        Student stu=new Student();
        stu.setAge(-10);
        int actual=stu.getAge();
        Assert.assertEquals(actual, 0);
    }
    
    @Test()
    public void testGetterOfStudentModel() {
        Student stu=new Student("Nguyen", "Hoang", 1, 18, "0987878787");
            Assert.assertEquals(stu.getFirstName(), "Nguyen");
            Assert.assertEquals(stu.getLastName(), "Hoang");
            Assert.assertEquals(stu.getId(), 1);
            Assert.assertEquals(stu.getAge(), 18);
            Assert.assertEquals(stu.getPhoneNumber(), "0987878787");
        try {
        } catch (Exception e) {
            System.out.println("Bug: "+ e.getMessage());
        }   
    }
    
}
