package com.lxf.testing;


import org.testng.annotations.*;


public class BasicAnnotion {
    @Test
    public void testCase1() {
        System.out.println("这是测试用例1");

    }

    @Test
    public void testCase2() {
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("这是测试用例beforeMethod");
    }

    @AfterMethod
    public void aftermethod() {
        System.out.println("这是测试用例aftermethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }
}
