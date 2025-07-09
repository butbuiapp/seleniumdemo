package com.example.seleniumdemo.waitstrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Challenge5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/dynamicallyModifiedPage.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("buttonDelete")).click();

        WebElement elementToRemove = driver.findElement(By.id("element-to-remove"));
        var wait = new WebDriverWait(driver, Duration.ofMillis(100));
        boolean removed = wait.until(ExpectedConditions.invisibilityOf(elementToRemove));

        System.out.println(removed);

        driver.quit();
    }
}
