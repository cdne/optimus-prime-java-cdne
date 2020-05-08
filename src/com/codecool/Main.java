package com.codecool;

import java.util.HashMap;
import java.util.Map;

public class Main {
    HashMap<Integer, Boolean> result = new HashMap<>();
    int[] primeNumbers = {2, 3, 5, 8};


    public static void main(String[] args) {
        Main main = new Main();
        main.sieve(1000);
    }


    /** Generate numbers from 1 to n
     *
     * In hashmap for each number key we assign true value
     * @param n max value
     */
    void sieve(int n) {
        // add numbers hashmap
        for (int i = 2; i <= n; i++) {
            result.put(i, true);
        }

        // for each prime number call getPrimeNumbers
        for (int primeNumber : primeNumbers) {
            getPrimeNumbers(primeNumber);
        }

        // display prime numbers
        displayPrimeNumbers(result);
    }

    /** Check if hashmap key is not a prime number
     *
     * @param primeNumber prime numbers 2, 3, 5 and 7
     */
    void getPrimeNumbers(int primeNumber) {
        for (Map.Entry<Integer, Boolean> entry : result.entrySet()) {
            if ((entry.getKey() % primeNumber == 0) && entry.getKey() != primeNumber) {
                entry.setValue(false);
            }
        }
    }

    /** Display all prime numbers
     * When the hashmap value is true it means that key is a prime number
     * @param result prime numbers
     */
    void displayPrimeNumbers(HashMap<Integer, Boolean> result) {
        for (Map.Entry<Integer, Boolean> entry : result.entrySet()) {
            if (entry.getValue()) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

}
