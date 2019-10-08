package com.lxf.muilt;

import org.testng.annotations.Test;

public class MuiltXML {
    @Test
    public void tXml01() {
        System.out.println(Thread.currentThread().getName() + "多线程");
    }
    @Test
    public void tXml02() {
        System.out.println(Thread.currentThread().getName() + "多线程");
    }
    @Test
    public void tXml03() {
        System.out.println(Thread.currentThread().getName() + "多线程");
    }
    @Test
    public void tXml04() {
        System.out.println(Thread.currentThread().getName() + "多线程");
    }
}
