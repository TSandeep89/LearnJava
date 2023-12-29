package com.LearnJava;

public class ConstructOverload {

    ConstructOverload(String a)
    {
        System.out.println("base constructor");
    }

    ConstructOverload(String a, String b)
    {
        System.out.println("derived class");
    }

    public static void main(String[] args) {
        //ConstructOverload load = new ConstructOverload("sandeep", "thodeti");
        ConstructOverload load = new ConstructOverload("sandeep");

    }
}
