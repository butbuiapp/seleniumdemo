package com.example.seleniumdemo.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.selenium.dev/selenium/web/mouseOver.html");

        // Maximize window (optional)
        driver.manage().window().maximize();

        var redBox = driver.findElement(By.id("redbox"));
        System.out.println(redBox.getCssValue("background-color"));

        // hover action
        new Actions(driver).moveToElement(redBox).perform();
        System.out.println(redBox.getCssValue("background-color"));

    }
}
