package com.cybertek.tests.day8_types_of_elements2;


import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class probeArbeit_8 {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropElement = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateList = new Select(dropElement);

        String expectedOption = "Select a State";
        String actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"VERIFY FIRST SELECTION IS SELECT A STATE");

        stateList.selectByVisibleText("Texas");

        actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,"Texas");



        stateList.selectByIndex(51);
        System.out.println(stateList.getFirstSelectedOption());
        stateList.selectByValue("VA");
        System.out.println(stateList.getFirstSelectedOption().getText());




    }




            }













