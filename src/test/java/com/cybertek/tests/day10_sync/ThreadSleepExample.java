package com.cybertek.tests.day10_sync;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepExample {

    WebDriver driver;

    @BeforeMethod
    public void registerForm() {
        driver = WebDriverFactory.getDriver("chrome");
    }


    @AfterMethod
    public void downMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void  test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
        Thread.sleep(5000);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("MikeSmith");



    }


}