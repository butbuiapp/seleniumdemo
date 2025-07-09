package com.example.seleniumdemo.locatorstrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/formPage.html");
        driver.manage().window().maximize();

        //driver.findElement(By.id("imageButton")).click();

//		driver.findElement(
//				RelativeLocator.with(By.cssSelector("input[value='Click!']"))
//				.toLeftOf(By.id("lone_disabled_selected_radio"))).click();

        WebElement textbox = driver.findElement(By.name("id-name1"));
        textbox.getText();
        textbox.clear();
        textbox.sendKeys("selenium");

    }
}
