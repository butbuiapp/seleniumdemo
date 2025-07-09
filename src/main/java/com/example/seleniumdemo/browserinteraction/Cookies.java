package com.example.seleniumdemo.browserinteraction;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        Cookie cookie = new Cookie("theme", "light");
        driver.manage().addCookie(cookie);

        // get cookie
        Cookie themeCookie = driver.manage().getCookieNamed("theme");
        System.out.println(themeCookie.getDomain());

        driver.manage().deleteCookieNamed("theme");
        System.out.println(driver.manage().getCookies().size());

    }
}
