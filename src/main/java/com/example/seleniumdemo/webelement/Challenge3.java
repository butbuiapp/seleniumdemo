package com.example.seleniumdemo.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("my-text-id")).sendKeys("username");
        driver.findElement(By.name("my-password")).sendKeys("password");
        driver.findElement(By.name("my-textarea")).sendKeys("I am learning Selenium WebDriver");

        Select dropdown = new Select(driver.findElement(By.name("my-select")));
        dropdown.selectByValue("3");

        WebElement myCheck1 = driver.findElement(By.id("my-check-1"));
        if (myCheck1.isSelected()) myCheck1.click();

        WebElement myCheck2 = driver.findElement(By.id("my-check-2"));
        if (!myCheck2.isSelected()) myCheck2.click();

        //WebElement myRadio1 = driver.findElement(By.id("my-radio-1"));
        WebElement myRadio2 = driver.findElement(By.id("my-radio-2"));
        myRadio2.click();

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

    }
}
