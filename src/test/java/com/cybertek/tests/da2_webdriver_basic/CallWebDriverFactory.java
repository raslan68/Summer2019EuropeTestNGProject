package com.cybertek.tests.da2_webdriver_basic;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("firefox");

        driver.get("https://www.firefox");
    }


}
