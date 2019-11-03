package com.cybertek.tests.day3_webelemt_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifxConfirmationMessage {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputbox = driver.findElement(By.name("email"));

        String expectedEmail = "test@gmail.com";

        emailInputbox.sendKeys(expectedEmail);

        String actualEmail = emailInputbox.getText();

        String expectecEmail = emailInputbox.getAttribute("value");

        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedEmail ="+ expectedEmail);
            System.out.println("actualEmail ="+ actualEmail);
        }

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

    }


}
