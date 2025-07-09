package com.example.seleniumdemo.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownMenus {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        Select dropdown = new Select(driver.findElement(By.name("my-select")));
        dropdown.selectByValue("2");
        dropdown.selectByVisibleText("Three");
        dropdown.selectByIndex(1);

        WebElement selectedOption = dropdown.getFirstSelectedOption();
        List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();

        dropdown.deselectByValue("2");
        dropdown.deselectByVisibleText("One");
        dropdown.deselectByIndex(1);
    }
}
