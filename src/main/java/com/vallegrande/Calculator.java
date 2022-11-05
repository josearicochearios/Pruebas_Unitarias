package com.vallegrande;

public class Calculator {

    public int add (int a, int b){
        return a + b;
    }

    public int subtract (int a, int b){
        return a - b;
    }

    public int multiply (int a, int b){
        return a * b;
    }

    public int split (int a, int b){
        return a / b;
    }

    public String greeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Calculator().greeting());
    }

}
