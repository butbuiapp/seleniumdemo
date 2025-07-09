package com.example.seleniumdemo.detectingstate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        boolean isVisible = driver.findElement(By.name("my-hidden")).isDisplayed();

        driver.quit();
    }
}
