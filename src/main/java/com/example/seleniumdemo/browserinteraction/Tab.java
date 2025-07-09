package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");
        driver.manage().window().maximize();
        System.out.println("Now on page: " + driver.getTitle());

        driver.findElement(By.id("a-link-that-opens-a-new-window")).click();

        // get all of open windows
        var windows = driver.getWindowHandles();

        String originalWindow = driver.getWindowHandle();
        for (String window : windows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        System.out.println("Now on page: " + driver.getTitle());

        driver.switchTo().window(originalWindow);
        System.out.println("Now on page: " + driver.getTitle());

        driver.quit();
    }
}
