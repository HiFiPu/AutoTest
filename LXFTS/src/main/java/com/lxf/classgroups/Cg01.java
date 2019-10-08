package com.lxf.classgroups;

import org.testng.annotations.Test;
@Test(groups = "tg01")
public class Cg01 {
    @Test
    public void cg011(){
        System.out.println("cg011");
    }

    @Test
    public void cg012() {
        System.out.println("cg012");
    }
}
