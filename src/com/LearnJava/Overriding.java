package com.LearnJava;

class Overriding {

    void test() {
        System.out.println("parent method");
    }
}
    class data extends Overriding {
        void test() {
            System.out.println("child method");
        }


    public static void main(String[] args) {

        data dt = new data();
        //Overriding dt = new Overriding();
        dt.test();

    }
}
