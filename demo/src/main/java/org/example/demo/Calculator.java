package org.example.demo;

public class Calculator {

    private static long factorial(int n) {
        if (n == 0) return 1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double calculateSum(int n, double x) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(-x, i) / factorial(i);
        }
        return sum;
    }

    public static double calculateSumLargerTerms(int n, double x, double e) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double term = Math.pow(-x, i) / factorial(i);
            if (Math.abs(term) > e) {
                sum += term;
            }
        }
        return sum;
    }

    public static double exactValue(double x) {
        return Math.exp(-x);
    }
}

