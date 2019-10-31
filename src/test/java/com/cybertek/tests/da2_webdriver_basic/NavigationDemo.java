package com.cybertek.tests.da2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args)  throws InterruptedException {



        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //navigate to website
        driver.get("https://google.com");

        Thread.sleep(5000);

        //another way to opening website
        driver.navigate().to("https://ww.facebook.com");

        //goes back to previous webpage
        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();
    }
}