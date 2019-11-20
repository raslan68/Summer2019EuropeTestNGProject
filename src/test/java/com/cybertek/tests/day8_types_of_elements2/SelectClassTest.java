package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create Select object by passing the element as a constructor
        Select stateList = new Select(dropdownElement);

        //getOptions---> returns all the available options the dropdown list
        List<WebElement> options = stateList.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());

        }
    }

    @Test
    public void test2() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("state"));

        //create Select object by passing the element as aconstructor
        Select stateList = new Select(dropdownElement);

        //verify that first options is "Select a State"
        String expectedOption = "Select a State";
        String actualOptions = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptions, expectedOption, "verify first selection is select a state");

        //HOW TO SELECT OPTIONS FROM THE DROPDOWN?
        //1.USING VISIBLE TEXT
        //selectByVisibleText("text")-->selecting based on the visible text
        stateList.selectByVisibleText("Texas");

        actualOptions = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptions,"Texas");

        //2.USING INDEX NUMBER
        //total option -->52
        stateList.selectByIndex(51);
        actualOptions =stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptions,"Wyoming");

        //3.USING VALUE
        stateList.selectByValue("VA");
        System.out.println(stateList.getFirstSelectedOption());



    }
}
