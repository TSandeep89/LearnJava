package com.LearnJava;

 interface Kia{

       void tata();
        void maruti();
         }

    class Vogan implements Kia {
      public void tata() {
            System.out.println("tata method");
        }

      public void maruti() {
            System.out.println("maruti method");
        }

    public static void main(String[] args) {

            Vogan vg = new Vogan();
            vg.maruti();
            vg.tata();
        }
    }

