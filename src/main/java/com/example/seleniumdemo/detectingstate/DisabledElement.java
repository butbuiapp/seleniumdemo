package com.example.seleniumdemo.detectingstate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        boolean isEnabled = driver.findElement(By.name("my-disabled")).isEnabled();

        driver.quit();
    }
}
