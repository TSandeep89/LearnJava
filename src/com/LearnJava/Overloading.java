package com.LearnJava;

public class Overloading {

    void test(String a)
    {
        System.out.println("parent class");
    }
    void test(String a, String b)
    {

        System.out.println("child class");
    }

    public static void main(String[] args) {
        Overloading od = new Overloading();
       // od.test("sandeep", "thodeti");
        od.test("sandeep");

    }
}
