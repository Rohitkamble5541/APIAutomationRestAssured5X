package com.thetestingacademy.bpdemo;

public class BuilderPatternDesignPatternJava {



    // Change Return Type of each method as class type
    // "this" always points to current / calling object . Returning the same to
    // have same reference

    public BuilderPatternDesignPatternJava stag1()
    {
        System.out.println("stag 1");
        return this;
    }


    public BuilderPatternDesignPatternJava stag2()
    {
        System.out.println("stag 2");
        return this;
    }


    public BuilderPatternDesignPatternJava stag3()
    {
        System.out.println("stag 3");
        return this;
    }

    public static void main(String[] args) {

        BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
        //bp.stag1().stag2("test").stag3();
    }


}

