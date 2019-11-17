package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableElementTest {

    @Test
    public  void  tast1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenRdioButton = driver.findElement(By.id("green"));

        //how can we check is button enable or not?
        System.out.println("is element enabled: "+ greenRdioButton.isEnabled());

        //verify that green button is disabled
        Assert.assertFalse(greenRdioButton.isEnabled(),"verif that green button is disable");

        driver.quit();

    }

    @Test
    public  void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        System.out.println("is input enabled: "+ inputBox.isEnabled());

        inputBox.sendKeys("Mike Smith");


    }
}
