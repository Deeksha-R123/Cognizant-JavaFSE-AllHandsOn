package com.cognizant;

public class CodeQualityExample {

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        System.out.println("SonarQube Code Quality Demo");
        System.out.println("Sum: " + add(10, 20));
        System.out.println("Positive: " + isPositive(5));
    }
}