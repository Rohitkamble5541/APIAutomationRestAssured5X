package com.thetestingacademy.Testng.ListenerDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomList.class)

public class TestCase001 {

    @Test(groups = "sanity")
    public void test1() {
        System.out.println("true1");
        Assert.assertTrue(false);

    }


    @Test(groups = "sanity")
    public void test2() {
        System.out.println("true2");
        Assert.assertTrue(true);

    }
}
