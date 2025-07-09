package com.example.seleniumdemo.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        WebElement textbox = driver.findElement(By.name("id-name1"));
        textbox.getText();
        textbox.clear();
        textbox.sendKeys("angie"); // set value to textbox
    }
}
