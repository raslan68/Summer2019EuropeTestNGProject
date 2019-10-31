package com.cybertek.tests.da2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuit {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        Thread.sleep(3000);

        //quit()-->close all windows and tabs and pop ups  etc.
        driver.quit();

        //close()--> closes the current tab
  //      driver.close();

    }

}
