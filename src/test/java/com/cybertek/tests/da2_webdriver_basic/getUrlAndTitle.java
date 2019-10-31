package com.cybertek.tests.da2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        String title = driver.getTitle();

        //soutv (shortcase)
        System.out.println("title = " + title);

        //getCurrentUrl()--> get the current url of the page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        
        //getPageSource()--> gets the source cade of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);





    }


}
