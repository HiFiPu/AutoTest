package com.lxf.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestGroups {
    @Test(groups = "tg01")
    public void Tg01() {
        System.out.println("tg01");
    }

    @Test(groups = "tg01")
    public void Tg02() {
        System.out.println("tg02");
    }

    @Test(groups = "tg10")
    public void Tg03() {
        System.out.println("tg03");
    }

    @Test(groups = "tg10")
    public void Tg04() {
        System.out.println("tg04");
    }

    @Test(groups = "tg11")
    public void Tg05() {
        System.out.println("tg05");
    }

    @Test(groups = "tg12")
    public void Tg06() {
        System.out.println("tg06");
    }
    @AfterGroups({"tg01","tg10"})
    public void fZ01(){
        System.out.println("后执行组1");
    }
    @BeforeGroups({"tg01","tg10"})
    public void fz02(){
        System.out.println("先执行组1");
    }
}
