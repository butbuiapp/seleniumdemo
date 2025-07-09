package com.example.seleniumdemo.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        // Maximize window (optional)
        driver.manage().window().maximize();

        var input = driver.findElement(By.id("clickable"));
        // double-click action
        new Actions(driver).contextClick(input).perform();
        System.out.println(driver.findElement(By.id("click-status")).getText());

        driver.quit();
    }
}
