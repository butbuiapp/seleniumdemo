package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/modal_dialogs/modern_modal.html");
        driver.manage().window().maximize();

        System.out.println("Now on page: " + driver.getTitle());

        driver.findElement(By.id("trigger-modal-btn")).click();

        WebElement modal = driver.findElement(By.id("modalContent"));
        if (modal.isDisplayed()) {
            System.out.println("Modal is displayed");
            driver.findElement(By.id("modal-input")).sendKeys("Hey modal");
            driver.findElement(By.id("modal-close")).click();

        } else {
            System.out.println("Modal is not displayed");
        }

        //driver.quit();
    }
}
