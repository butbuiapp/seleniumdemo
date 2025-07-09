package com.example.seleniumdemo.locatorstrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        WebElement bottomButton = driver.findElement(
            RelativeLocator.with(By.name("submit")).below(By.id("submit")));

        driver.quit();
    }
}
