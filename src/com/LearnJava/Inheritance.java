package com.LearnJava;

public class Inheritance {

    public void test() {
        System.out.println("base method");

    }
}
     class Bike extends Inheritance {
        public void data() {
            System.out.println("derived class");
        }
    }
         class Van extends Bike
        {
            public void delay()
            {
                System.out.println("chilshhfh class");
            }
        }
      class Truck
      {
          public static void main(String[] args) {

              Van vc = new Van();
              vc.test();
              vc.delay();
              vc.data();
          }
      }




