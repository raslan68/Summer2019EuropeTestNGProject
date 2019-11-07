package com.cybertek.tests.day4_basic_locators;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

      //  WebElement link3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        //link3.click();

        //lazy way
       // driver.findElement(By.linkText("home")).click();

        //partial text
       WebElement link6 = driver.findElement(By.partialLinkText("6"));
       link6.click();

    }
}
