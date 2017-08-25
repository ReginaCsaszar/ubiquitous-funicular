package com.primes;

public class Basic {

    public static void execute(int max) {
        boolean [] numbers = new boolean[max+1];
        int counter = 0;

        for(int i = 2; i < numbers.length; i++)
            numbers[i] = true;

        for(int i = 2; i*i <= max; i++) {

            for (int j = i; j * i <= max; j++) {
                numbers[i * j] = false;
            }
        }

        for (int i = 2; i <= max; i++) {
            if (numbers[i]) counter++;
        }

        System.out.println("\nIn the range 1-" + max + ", " + counter + " primes found.");
    }
}
