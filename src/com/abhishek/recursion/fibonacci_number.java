package com.abhishek.recursion;

public class fibonacci_number {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static  int fib(int n){

        if(n==0|| n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
