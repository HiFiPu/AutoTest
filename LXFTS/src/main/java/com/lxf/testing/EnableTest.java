package com.lxf.testing;

import org.testng.annotations.Test;

public class EnableTest {
    @Test
    public void testZX(){
        System.out.println("执行");
    }
    @Test(enabled = false)
    public void testBZX(){
        System.out.println("不执行");
    }
}
