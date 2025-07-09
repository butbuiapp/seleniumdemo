package com.example.seleniumdemo.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();

        String filePath = "C:\\Learning\\Testing\\Selenium\\Workspace\\WebElements\\resources\\input.txt";
        WebElement uploadElement = driver.findElement(By.name("my-file"));
        uploadElement.sendKeys(filePath);

    }
}
