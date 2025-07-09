package com.example.seleniumdemo.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.selenium.dev/selenium/web/draggableLists.html");

        // Maximize window (optional)
        driver.manage().window().maximize();

        WebElement leftItem = driver.findElement(By.id("leftitem-1"));
        WebElement rightItem = driver.findElement(By.id("rightitem-1"));

        // drag left item and drop it below the 1st right item
        new Actions(driver).dragAndDrop(leftItem, rightItem).perform();

        var rightItems = driver.findElements(By.cssSelector("#sortable2 li"));
        rightItems.forEach(e -> System.out.println(e.getText()));

    }
}
