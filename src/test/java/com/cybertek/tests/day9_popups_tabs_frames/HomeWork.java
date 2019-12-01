package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork {

    WebDriver driver;

    @BeforeMethod
    public void registerForm(){
        driver = WebDriverFactory.getDriver("chrome");
    }


    @AfterMethod
    public void  downMethod() throws InterruptedException{
        Thread.sleep(3000);


    }
    @Test
    public void test1() throws InterruptedException{
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));
        register.click();
        WebElement birthDate = driver.findElement(By.name("birthday"));
        birthDate.sendKeys("The date of birth is not valid");
       Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void test2(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));
        register.click();
        WebElement language = driver.findElement(By.xpath("//label[contains(text(),'Select programming languages')]"));
        System.out.println(language.isDisplayed());

    }

    @Test
    public void test3(){
        driver.get(("https://practice-cybertekschool.herokuapp.com"));
        WebElement register =driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));
        register.click();
        WebElement firstName = driver.findElement(By.cssSelector("div.container div.row:nth-child(2) " + "div.large-12.columns div.container:nth-child(1) div.row div.col-md-9.col-md-offset-1 form.form-horizontal.bv-form div.form-group.has-feedback:nth-child(1) div.col-sm-5 > input.form-control:nth-child(1)"));
        firstName.sendKeys("f");

    }
    @Test
    public  void test4(){
        driver.get(("https://practice-cybertekschool.herokuapp.com"));
        WebElement register =driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));
        register.click();
        WebElement lastName = driver.findElement(By.cssSelector("div.container div.row:nth-child(2) div.large-12.columns div.container:nth-child(1) div.row div.col-md-9.col-md-offset-1 form.form-horizontal.bv-form div.form-group.has-feedback:nth-child(2) div.col-sm-5 > input.form-control:nth-child(1)"));
        lastName.sendKeys("D");


    }

    @Test
    public void test5() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement register =driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]"));
        driver.manage().window().maximize();
        register.click();

        WebElement firstName = driver.findElement(By.cssSelector("div.container div.row:nth-child(2) " + "div.large-12.columns div.container:nth-child(1) div.row div.col-md-9.col-md-offset-1 form.form-horizontal.bv-form div.form-group.has-feedback:nth-child(1) div.col-sm-5 > input.form-control:nth-child(1)"));
        firstName.sendKeys("Mike");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.cssSelector("div.container div.row:nth-child(2) div.large-12.columns div.container:nth-child(1) div.row div.col-md-9.col-md-offset-1 form.form-horizontal.bv-form div.form-group.has-feedback:nth-child(2) div.col-sm-5 > input.form-control:nth-child(1)"));
        lastName.sendKeys("Smith");
        Thread.sleep(1000);

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Mikesmith");
        Thread.sleep(1000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("email@gmail.com");
        Thread.sleep(1000);

        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("saidfurkan");
        Thread.sleep(1000);

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("916-438-0888 ");
        Thread.sleep(1000);

         WebElement gender1 = driver.findElement(By.xpath("//input[@value='male']"));
         gender1.click();
         System.out.println(gender1.isSelected());
         Thread.sleep(1000);

         WebElement birthDay = driver.findElement(By.xpath("//input[@name='birthday']"));
         birthDay.sendKeys("03/04/1980");
         Thread.sleep(1000);

        WebElement department = driver.findElement(By.xpath("//option[contains(text(),'Department of Engineering')]"));
        department.click();
        System.out.println(department.isSelected());
        Thread.sleep(1000);

        WebElement jobTitel = driver.findElement(By.xpath("//option[contains(text(),'QA')]"));
        jobTitel.click();
        System.out.println(jobTitel.isSelected());
        Thread.sleep(1000);

        WebElement language = driver.findElement(By.xpath("//input[@value='java']"));
        language.click();
        System.out.println(language.isSelected());
        Thread.sleep(Long.parseLong("1000"));

        WebElement signButton = driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
        signButton.click();
        Thread.sleep(100);






    }


}














