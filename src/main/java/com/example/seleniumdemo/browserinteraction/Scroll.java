package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
//        driver.get("https://www.selenium.dev/selenium/web/scroll.html");
//
//        // Maximize window (optional)
//        driver.manage().window().maximize();
//
//        var line9 = driver.findElement(By.id("line9"));
//        new Actions(driver).scrollToElement(line9).perform();

        // scroll by amount
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/page_with_tall_frame.html");
        var height = driver.findElement(By.tagName("body")).getSize().getHeight();
        new Actions(driver).scrollByAmount(0, height).perform();

        //driver.quit();
    }
}
