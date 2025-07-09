package com.example.seleniumdemo.tests;

import com.example.seleniumdemo.BaseTests;
import com.example.seleniumdemo.pageobjects.ModifiedPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModifiedTests extends BaseTests {
    private ModifiedPage modifiedPage;

    @BeforeEach
    public void loadPage() {
        driver.get("https://www.selenium.dev/selenium/web/dynamicallyModifiedPage.html");
        modifiedPage = new ModifiedPage(driver);
    }

    @Test
    public void notClickDeleteButton() {
        boolean isPresent = modifiedPage.isElementToRemovePresent();
        assertTrue(isPresent);
    }

    @Test
    public void clickDeleteButton() {
        boolean isPresent = modifiedPage.deleteElement();
        assertFalse(isPresent);
    }
}
