package com.cybertek.tests.day10_sync;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {


    WebDriver driver;

    @BeforeMethod
    public void registerForm() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }
    @AfterMethod
    public void downMethod() throws InterruptedException {
        /*Thread.sleep(2000);*/
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        String message = driver.findElement(By.id("finish")).getText();
        System.out.println(message);






    }
}
