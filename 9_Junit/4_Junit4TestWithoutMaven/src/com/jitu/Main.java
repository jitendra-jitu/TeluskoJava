package com.jitu;

public class Main {

    public static String ReverseString(String str){

        int len=str.length();
        String temp="";

        while (temp.length()<str.length()){
            temp=temp+str.charAt(len-1);
            len--;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(ReverseString("happyhappy"));
    }
}