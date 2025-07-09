package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");

        // Maximize window (optional)
        driver.manage().window().maximize();

        driver.findElement(By.id("open-window-with-onload-alert")).click();
        // get all of open windows
        var windows = driver.getWindowHandles();

        String originalWindow = driver.getWindowHandle();
        for (String window : windows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                Alert alert = driver.switchTo().alert();
                System.out.println(alert.getText());
                alert.accept();
                break;
            }
        }
    }
}
