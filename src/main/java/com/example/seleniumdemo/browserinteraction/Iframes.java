package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/click_tests/click_in_iframe.html");
        driver.manage().window().maximize();

        driver.switchTo().frame("ifr");
        driver.findElement(By.id("link")).click();

        // back to the parent page
        driver.switchTo().defaultContent();

    }
}
