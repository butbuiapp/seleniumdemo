package com.example.seleniumdemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModifiedPage {
    private By deleteButton = By.id("buttonDelete");
    private By elementToRemove = By.id("element-to-remove");

    private WebDriver driver;

    public ModifiedPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDeleteButton() {
        driver.findElement(deleteButton).click();
    }

    public boolean isElementToRemovePresent() {
        try {
            driver.findElement(elementToRemove);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean deleteElement() {
        clickDeleteButton();
        var wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementToRemove));
        return isElementToRemovePresent();
    }
}
