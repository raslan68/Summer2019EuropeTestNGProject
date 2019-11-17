package com.cybertek.tests.day7_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {

    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals("1","1");

        System.out.println("Second Assertion");
        Assert.assertEquals("title","title");

        System.out.println("after second assertion");
    }

    @Test
    public void test2(){
        //verify that title starts with C
        String actualTitle = "Cybertek";
        String expectTitleBeginning = "C";

        System.out.println("first assertion");
        Assert.assertTrue((actualTitle.startsWith(expectTitleBeginning)),"verify title starts with C ");

        //TASK
        //verif that email includes @ sign
        Assert.assertTrue("yasin@mail".contains("@"),"Verify @ in email");

    }
    @Test
    public  void test3(){

        Assert.assertNotEquals("one","two");
    }
    @Test
    public void test4(){

        Assert.assertFalse((1<4),"CHECK IF IT WRONG");
    }



}
