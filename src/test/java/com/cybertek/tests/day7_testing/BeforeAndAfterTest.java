package com.cybertek.tests.day7_testing;


import org.testng.annotations.*;

public class BeforeAndAfterTest {

    @Test
    public void test1(){
        System.out.println("This is test 1");

    }
    @Test
    public void  test2(){
        System.out.println("this is my second Test");
    }

    @Test
    public void test3(){
        System.out.println("this is my test Three");

    }

    @BeforeMethod
    public void  setUpMethod(){

        System.out.println("BEFORE METHOD");
        System.out.println("OPENING THE BROWSER");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("AFTER METHOD");
        System.out.println("CLOSE BROWSER");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS CODE");

    }

    @AfterClass
    public  void  afterClass(){
        System.out.println("AFTER CLASS CODE");
        System.out.println("REPORTING");

    }


}
