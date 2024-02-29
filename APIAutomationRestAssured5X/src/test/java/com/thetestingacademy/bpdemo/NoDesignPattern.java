package com.thetestingacademy.bpdemo;

public class NoDesignPattern {

    public void stag1()
    {

        System.out.println("Step 1");
    }

    public void stag2()
    {
        System.out.println("Step 2");
    }

    public void stag3()
    {
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        NoDesignPattern np = new NoDesignPattern();
        np.stag1();
        np.stag2();
        np.stag3();


    }
}


