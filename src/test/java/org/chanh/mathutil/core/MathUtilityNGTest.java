/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.chanh.mathutil.core;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

/**
 *
 * @author Triệu
 */
public class MathUtilityNGTest {
    
    public MathUtilityNGTest() {
    }
    
    @DataProvider(name = "testDataOfASetOfFibonacciNumbers")
    public  Object[][] testDataOfASetOfFibonacciNumbers() {
        return new Object[][] {
            {0,0},
            {1,1},
            {2,1},
            {3,2},
            {4,3},
            {6,8},
            {12,144},
            {15,610}
        };
    }
    
    
    /**
     * Test of getFibonacciNumber method, of class MathUtility.
     */
    @Test(dataProvider = "testDataOfASetOfFibonacciNumbers")
    public void testGetFibonacciNumber(int n, int expected) {
        int result = MathUtility.getFibonacciNumber(n);
        Assert.assertEquals(result, expected);
    }
    
}
