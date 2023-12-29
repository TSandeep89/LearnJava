package com.LearnJava;

 public class TypeCasting {

    void test() {
        System.out.println("parent class");
    }

}

  class Casting extends TypeCasting {

    void testname() {

        System.out.println("chlid class");
    }

     public static void main(String[] args) {

        TypeCasting t1 = new Casting();
        t1.test();
     }

}
