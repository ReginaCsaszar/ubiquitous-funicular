package com.primes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int limit;
        Scanner select = new Scanner(System.in);

        System.out.println("Please give the upper limit of the count: ");
        limit = select.nextInt();

        Basic.execute(limit);

    }
}
