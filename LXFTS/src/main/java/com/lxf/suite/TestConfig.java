package com.lxf.suite;

import org.testng.annotations.*;

public class TestConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
}
