/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package org.swt301.testng_testcase.core.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    private String baseUrl;

    @BeforeTest
    public void setUp() {
        baseUrl = "http://localhost:8080/functionlogin-maven/";
    }

    @AfterTest
    public void tearDown() {
        baseUrl = null;
    }

    @Test
    public void testLoginSuccess() throws IOException {
        String username = "admin";
        String password = "password";
        String urlString = baseUrl + "LoginServlet?username=" + username + "&password=" + password;

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.connect();

        assertEquals(connection.getResponseCode(), 200);

        connection.disconnect();
    }

    @Test
    public void testLoginFailure() throws IOException {
        String username = "admin";
        String password = "wrongpassword";
        String urlString = baseUrl + "LoginServlet?username=" + username + "&password=" + password;

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.connect();

//        String newUrl = "";
//        if (connection.getResponseCode() == 302) {
//            newUrl = connection.getHeaderField("Location");
//        }
//
//        String expectedValue = baseUrl + "errorpage.jsp";
//        assertEquals(newUrl, expectedValue);
        assertEquals(connection.getResponseCode(), 302);

        connection.disconnect();
    }
}
