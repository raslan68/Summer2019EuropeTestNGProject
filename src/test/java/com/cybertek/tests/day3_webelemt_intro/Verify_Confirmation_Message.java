package com.cybertek.tests.day3_webelemt_intro;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Verify_Confirmation_Message {

    /**open browser
     go to http://practice.cybertekschool.com/forgot_passwordLinks zu einer externen Website
     enter any email
     verify that email is displayed in the input box
     click on Retrieve password
     verify that confirmation message says 'Your e-mail's been sent!'*/

    public static void main(String[] args) {

        //Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get(" http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputbox = driver.findElement(By.name("email"));
        String expectedEmail = "test@gmail.com";
        //send expectedEmail
        emailInputbox.sendKeys(expectedEmail);

        //verify that email is displayed in the input box
        //getting text from webelelements
        //getText()-->get text from web element %99
        //getAttribute()--> get the value of attributes
        String actualEmail = emailInputbox.getAttribute("value");

        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail = +"+ actualEmail);

        }
        //locating retrievePasswordButton using id attribute
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        //clicking webElement
        retrievePasswordButton.click();

        //verify that confirmation message says "your e-mail`s been sent"
        String expectedMessage = "Your e-mail`s been sent!";

        WebElement messsageElement = driver.findElement(By.name("confirmation_message"));
        String actualMessage = messsageElement.getText();

        if(expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage ="+ expectedMessage);
            System.out.println("actualMessage ="+actualMessage);
        }

        //close the browser
        driver.quit();




    }
}
