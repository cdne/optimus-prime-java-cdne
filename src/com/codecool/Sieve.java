package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Sieve {
    static int n;
    static boolean[] isPrime;
    static List<Integer> primeNumbers = new ArrayList<>();


    public static void main(String[] args) {
        n = 100;
        isPrime = new boolean[n + 1];
        setBooleanValue(n);
        checkIfNumberIsPrime();
        generateNumbers();
        System.out.println("Prime numbers: " + primeNumbers);

    }

    static void setBooleanValue(int n) {
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
    }

    static void checkIfNumberIsPrime() {
        for (int number = 2; number * number <= n; number++) {
            if (isPrime[number]) {
                for (int i = number; number * i <= n; i++) {
                    isPrime[number * i] = false;
                }
            }
        }
    }

    static void generateNumbers() {
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primeNumbers.add(i);
            }
        }
    }


}
