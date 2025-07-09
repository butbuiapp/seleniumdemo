package com.example.seleniumdemo.tests;

import com.example.seleniumdemo.BaseTests;
import com.example.seleniumdemo.pageobjects.LoginPage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTests {
    private LoginPage loginPage;

    @BeforeEach
    public void loadPage() {
        driver.get("https://www.selenium.dev/selenium/web/login.html");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void successfulLogin() {
        String message = loginPage.login("username", "password");
        assertEquals("You have successfully logged in.", message);
    }

    @Test
    public void loginWithNoUsername() {
        loginPage.setPassword("password");
        String message = loginPage.clickLoginButton();
        assertEquals("Please enter valid credentials", message);
    }
}
