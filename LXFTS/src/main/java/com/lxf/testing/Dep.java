package com.lxf.testing;

import org.testng.annotations.Test;

public class Dep {
    @Test
    public void dep01() {
        System.out.println("测试一");
//        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"dep01"})
    public void dep02() {
        System.out.println("测试二依赖测试一");
    }
}
