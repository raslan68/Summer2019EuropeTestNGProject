package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test
    public void test1(){
        WebDriver driver=  WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement =driver.findElement(By.id("dropdownMenuLink"));

        //open the dropdown
        dropdownElement.click();


        List<WebElement> listofLinks = driver.findElements(By.className("dropdown-item"));
        System.out.println("number of links "+ listofLinks.size());

        //text of first element in the list
        System.out.println(listofLinks.get(0).getText());
        for (WebElement link : listofLinks) {
            System.out.println(link.getText());
        }
        //locate the element and click it
        //driver.findElement(By.linkText("Yahoo")).click();

        //index of the list and click
        listofLinks.get(3).click();




    }

    }

