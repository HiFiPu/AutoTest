package com.lxf.testing;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BasicAnnotion {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是测试用例beforeMethod");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("这是测试用例aftermethod");
    }
}
