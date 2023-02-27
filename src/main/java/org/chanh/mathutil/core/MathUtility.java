/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.chanh.mathutil.core;

/**
 *
 * @author Triệu
 */
public class MathUtility {
    public static int getFibonacciNumber(int n) {
        if(n <= 1) {
            return n;
        }
        return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
    }
}
