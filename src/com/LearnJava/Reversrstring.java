package com.LearnJava;

public class Reversrstring {

    public static void main(String[] args) {

        String str = "my name is sandeep";
        String[] std = str.split(" ");
          int len = std.length;
          System.out.println(len);

          String rev = "";

          for (int i=len-1; i>=0; i--)
          {
              rev = rev + " "+std[i];

          }
//        for(String s:std)
//        {
//            System.out.print(s);
//        }

        System.out.println(rev);
    }


}
