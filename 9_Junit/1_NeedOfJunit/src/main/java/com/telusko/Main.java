package com.telusko;

public class Main {

    public static void main(String[] args) {

        Calculator calculator=new Calculator();

        int result=calculator.add(5,4);

        if(result==7){
            System.out.println("Its working successfully");
        }
        else{
            System.out.println("Test case Failed !!");
        }
    }
}