package com.example.seleniumdemo.waitstrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaits {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();

        // fluent wait
        driver.findElement(By.id("adder")).click(); // button
        WebElement FluentWait;
        var fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5)) // default is 500ms
                .pollingEvery(Duration.ofMillis(200)) // default is 250ms
                .ignoring(NoSuchElementException.class);
        WebElement box = fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.id("box0")));
    }
}
