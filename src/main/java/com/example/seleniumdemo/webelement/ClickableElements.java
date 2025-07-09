package com.example.seleniumdemo.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickableElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // click a button
        driver.findElement(
                By.xpath("//button[text()='Submit']")
                ).click();

        // click a link
        driver.findElement(
                By.xpath("//a[normalize-space(text())='Return to index']")
                ).click();

        driver.quit();
    }
}
