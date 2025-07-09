package com.example.seleniumdemo.actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");

        // Maximize window (optional)
        driver.manage().window().maximize();

        WebElement field1 = driver.findElement(By.id("withText"));
        WebElement field2 = driver.findElement(By.id("emptyTextArea"));

        Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
        Actions actions = new Actions(driver);

        // actions for Copy (ctrl-a, ctrl-v, then release control command)
        actions.click(field1)
                .keyDown(cmdCtrl)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(cmdCtrl)
                .perform();

        // actions for Paste (ctrl-v, then release control command)
        actions.click(field2)
                .keyDown(cmdCtrl)
                .sendKeys("v")
                .keyUp(cmdCtrl)
                .perform();

    }
}
