package com.cybertek.tests.day5_xpath;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_Test {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://amazon.com");

        WebElement serachBox = driver.findElement(By.id("twotabsearchtextbox"));
        serachBox.sendKeys("selenium");

        WebElement serachButton = driver.findElement(By.xpath("//input[@value='Go']"));
        serachButton.click();





    }


}
