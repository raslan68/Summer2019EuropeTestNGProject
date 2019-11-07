package com.cybertek.tests.day4_basic_locators;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class idLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximize the browser
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //click the don`t click button
        WebElement dontClickButton =driver.findElement(By.id("disappearing_button"));

        dontClickButton.click();

        driver.quit();




    }
}
