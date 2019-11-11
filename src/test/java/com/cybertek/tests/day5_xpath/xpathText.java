package com.cybertek.tests.day5_xpath;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathText {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement homelink = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/ul[1]/li[1]/a[1]"));
        homelink.click();

        WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'Button 1')]"));
        button1.click();
    }
}
