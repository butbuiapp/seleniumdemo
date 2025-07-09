package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/clicks.html");
        driver.manage().window().maximize();
        System.out.println("Now on page: " + driver.getTitle());

        driver.findElement(By.id("twoClientRects")).click();
        System.out.println("Now on page: " + driver.getTitle());

        driver.navigate().back();
        System.out.println("Now on page: " + driver.getTitle());

        driver.navigate().forward();
        System.out.println("Now on page: " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("Now on page: " + driver.getTitle());


        driver.quit();
    }
}
