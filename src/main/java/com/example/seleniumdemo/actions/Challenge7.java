package com.example.seleniumdemo.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.selenium.dev/selenium/web/keyboard_shortcut.html");

        // Maximize window (optional)
        driver.manage().window().maximize();

        Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
        Actions actions = new Actions(driver);
        actions.keyDown(cmdCtrl)
                .keyDown(Keys.SHIFT)
                .sendKeys("1")
                .keyUp(Keys.SHIFT)
                .keyUp(cmdCtrl)
                .perform();
    }
}
