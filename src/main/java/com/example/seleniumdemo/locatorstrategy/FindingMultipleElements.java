package com.example.seleniumdemo.locatorstrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingMultipleElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        List<WebElement> radioButtons =
                driver.findElements(By.cssSelector("input[type='radio']"));

        driver.quit();
    }
}
