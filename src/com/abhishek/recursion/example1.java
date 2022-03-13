package com.abhishek.recursion;

public class example1 {

    public static void main(String[] args) {
        message();

    }
    static void message(){
        System.out.println("Hello World");
        message1();
    }

    static void message1(){
        System.out.println("i am message 1");
        message2();
    }
    static void message2(){
        System.out.println("i am message 2");
        message3();
    }
    static void message3(){
        System.out.println("i am message 3");
        message4();
    }
    static void message4(){
        System.out.println("i am message 4");

    }
}
