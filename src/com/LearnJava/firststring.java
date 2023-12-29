package com.LearnJava;

public class firststring {

    public static void main(String[] args) {

        String str = "testing' world-, automation";
        int len = str.length();
        System.out.println("the length of string is " + len);
        String s2[] = str.split("'");
        for(String s:s2)
        {
            System.out.println(s);
        }
    }
}
