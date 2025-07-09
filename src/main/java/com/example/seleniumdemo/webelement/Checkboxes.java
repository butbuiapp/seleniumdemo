package com.example.seleniumdemo.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement checkbox = driver.findElement(By.id("my-check-1"));
        boolean isSelected = checkbox.isSelected();

        if (!isSelected)
            checkbox.click();

        driver.quit();
    }
}
