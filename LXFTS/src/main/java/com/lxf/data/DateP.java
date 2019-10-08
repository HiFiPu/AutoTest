package com.lxf.data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DateP {
    @Test(dataProvider = "data")
    public void daT01(String name, int age) {
        System.out.println("name: " + name + " age: " + age);
    }

    @DataProvider(name = "data")
    public Object[][] dTP() {
        Object[][] objects = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20}

        };
        return objects;
    }
    @Test(dataProvider = "MethordT")
    public void Methord01(String name,int age){
        System.out.println("Methord01........."+"name: " + name + " age: " + age);
    }

    @Test(dataProvider = "MethordT")
    public void Methord02(String name, int age) {
        System.out.println("Methord02........."+"name: " + name + " age: " + age);
    }
    @DataProvider(name = "MethordT")
    public Object[][] MethordAll(Method method){
        Object[][] objects = null;
        if(method.getName().equals("Methord01")){
            objects = new Object[][]{
                    {"Tom",26},
                    {"lili",27}
            };

        }else if (method.getName().equals("Methord02")){
            objects = new Object[][]{
                    {"kk",28},
                    {"ll",29}
            };
        }
        return objects;
    }
}
