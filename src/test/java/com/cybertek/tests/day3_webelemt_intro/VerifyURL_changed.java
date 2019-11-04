package com.cybertek.tests.day3_webelemt_intro;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURL_changed {
    /** open browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent */

    public static void main(String[] args) {

        //open the chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to "http://practice.cybertekschool.com/forgot_password Links to external site
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        //sendKeys()-->send keyboard actions to webelement
        emailInput.sendKeys("email@gmail.com");

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

        String expectedUrl =  " http://practice.cybertekschool.com/email_sent ";
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }
        //close
        driver.quit();



    }
}
