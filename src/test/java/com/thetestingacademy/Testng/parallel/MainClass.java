package com.thetestingacademy.Testng.parallel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainClass {

    @BeforeMethod
    public void beforemethod()
    {
        long id= Thread.currentThread().getId();
        System.out.println("Before test method thread id is :" + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodOne()
    {
        long id= Thread.currentThread().getId();
        System.out.println("Simple test method One. Thread id is  :" + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodTwo()
    {
        long id= Thread.currentThread().getId();
        System.out.println("Simple test method Two. Thread id is  :" + id + getClass().getSimpleName());
    }

    @AfterMethod
    public void aftermethod()
    {
        long id= Thread.currentThread().getId();
        System.out.println("After test method Thread id is  :" + id + getClass().getSimpleName());
    }



}
