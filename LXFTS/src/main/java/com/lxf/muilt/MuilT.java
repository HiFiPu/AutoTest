package com.lxf.muilt;

import org.testng.annotations.Test;

public class MuilT {
    @Test(invocationCount = 10, threadPoolSize = 10)
    public void tF() {
        System.out.println(Thread.currentThread().getName() + "............." + 2);
    }
}
