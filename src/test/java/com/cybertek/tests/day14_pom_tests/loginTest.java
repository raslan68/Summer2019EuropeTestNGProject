package com.cybertek.tests.day14_pom_tests;


import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest {


        WebDriver driver;
        @BeforeMethod
        public void setUpMethod(){
            driver = Driver.get();
        }
        @AfterMethod
        public void tearDownMethod() throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();
        }

        @Test
        public void test1(){
            driver.get( "https://qa1.vytrack.com");
            driver.findElement(By.id("prependedInput")).sendKeys("user1");
            driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);


        }
    }



