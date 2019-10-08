package com.lxf.testing;

import org.testng.annotations.Test;

public class Testtimeout {
    @Test(timeOut = 3000)
    public void tOut() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("成功");
    }

    @Test(timeOut = 3000)
    public void tOutf() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("失败");
    }
}
