package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInformation {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();

        String pageTitle = driver.getTitle();
        String currentURL = driver.getCurrentUrl();

        System.out.println(pageTitle);
        System.out.println(currentURL);

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
