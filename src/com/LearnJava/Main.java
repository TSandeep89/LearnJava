package com.LearnJava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(" test line");

        //Strings

        String name = "sandeep";
        String l_name = name;
        System.out.println(l_name);

        String f_name = "thodeti";
        String S_name = " sandeep";
        String n_name =  f_name + S_name;
        System.out.println(n_name);


        String name1 = "sandeep";
        System.out.println(name1.length());

        //charAT
        System.out.println(name1.charAt(3));

        //replace
        System.out.println(name1.replace('s','f'));

        //sub-string
        System.out.println(name1.substring(0,5));

        //Split a string
        String test = "sandeep";
        String[] d = test.split("e");   //String of array

        for (String m: d) {
            System.out.println(m);

        }

        //Reverse a string

        String str = "sandeep";
        int len = str.length();
        System.out.println("the value of string is " + len);
        String rev = "";

       for(int i = len-1; i>=0; i--)
       {
             rev = rev + str.charAt(i);

       }
        System.out.println("the reverse of string is " + rev);


        //Arrays

        int[] marks = {90, 96, 95, 98};
        System.out.println(marks[2]);
        //length
        System.out.println(marks.length);

        //Sort
        Arrays.sort(marks);
        System.out.println(marks[1]);
    }
}
