package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Screenshots {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a website
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            // Maximize window (optional)
            driver.manage().window().maximize();

            // Take screenshot
            TakesScreenshot screenshotTaker = (TakesScreenshot) driver;
            File srcFile = screenshotTaker.getScreenshotAs(OutputType.FILE);

            // Set destination path
            File destFile = new File("screenshot.png");

            // Copy file to desired location
            FileHandler.copy(srcFile, destFile);

            System.out.println("Screenshot saved to: " + destFile.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error saving screenshot: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
