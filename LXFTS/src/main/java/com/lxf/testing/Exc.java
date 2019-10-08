package com.lxf.testing;

import org.testng.annotations.Test;

public class Exc {
    @Test(expectedExceptions = RuntimeException.class)
    public void eC(){
        System.out.println("异常");
        throw new RuntimeException();
    }
}
