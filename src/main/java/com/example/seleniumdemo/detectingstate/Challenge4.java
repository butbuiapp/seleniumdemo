package com.example.seleniumdemo.detectingstate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Challenge4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/coordinates_tests/page_with_hidden_element.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement box = driver.findElement(By.id("box"));
        if (box.isDisplayed()) {
            box.click();
        } else {
            System.out.println("Box is not visible.");
        }
    }
}
