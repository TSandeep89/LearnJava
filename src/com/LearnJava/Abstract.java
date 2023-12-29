package com.LearnJava;

abstract class vechile {

    abstract void car();

    abstract void bus();

    void truck() {
        System.out.println("abstract method");
    }
}
             class automobile extends vechile
            {
                void car()
                {
                    System.out.println("car method");
                }
                void bus()
                {
                    System.out.println("bus method");
                }

                public static void main(String[] args) {

                    automobile at = new automobile();
                    at.bus();


            }
}
