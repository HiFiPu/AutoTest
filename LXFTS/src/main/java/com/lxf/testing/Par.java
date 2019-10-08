package com.lxf.testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Par {
    @Test
    @Parameters({"name","age"})
    public  void pR(String name,int age){
        System.out.println("name："+name+"age："+age);
    }
}
