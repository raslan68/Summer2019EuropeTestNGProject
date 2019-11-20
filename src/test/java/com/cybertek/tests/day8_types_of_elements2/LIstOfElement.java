package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LIstOfElement {
    
    @Test
            public void test1(){

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/multiple_buttons");
    
    List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("button sizes() ="+ buttons.size());
        Assert.assertEquals(buttons.size(),6,"Verify we got 6 buttons");

        for (WebElement button : buttons) {
            System.out.println(button.getText());
            
        }
    }

    @Test
    public void test2(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //wrong locator but we are not getting any error, we are getting empty list
        List<WebElement> buttons = driver.findElements(By.tagName("buttonsansadd"));
        System.out.println(buttons.size());
    }
}
