package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        prompts();
    }

    public static void alerts() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("alert")).click();

        Alert alert = driver.switchTo().alert();
        // get alert's message
        String message = alert.getText();
        System.out.println(message);

        // click OK on the alert
        alert.accept();
        driver.quit();
    }

    public static void confirmations() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("confirm")).click();

        Alert alert = driver.switchTo().alert();

        // click confirm on the alert
        alert.accept();
        // click cancel
        alert.dismiss();
    }

    public static void prompts() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        driver.manage().window().maximize();

        // Click the "prompt happen" link
        driver.findElement(By.id("prompt")).click();

        // Switch to the alert
        Alert promptAlert = driver.switchTo().alert();

        // Enter text into the prompt input field
        promptAlert.sendKeys("Selenium Test Input");

        // Accept the prompt
        promptAlert.accept();

        // Optional: Validate the result on the page
        String result = driver.findElement(By.id("text")).getText();
        System.out.println("Prompt result: " + result); // Should show your entered text

        driver.quit();
    }
}
