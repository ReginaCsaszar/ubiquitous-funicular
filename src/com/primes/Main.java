package com.primes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option, limit;
        menu();
        option = selectInt();
        if ((option > 0)&&(option < 4)) {
            System.out.println("Please give the upper limit of the count: ");
            limit = selectInt();
            if (limit > 0) {
                switch (option) {
                    case 1:
                        Basic.execute();
                        break;
                    case 2:
                        Memory.execute();
                        break;
                    case 3:
                        Cpu.execute();
                        break;
                }
            }
        }
    }

    static void menu() {

        System.out.println("Please select wich solution you want to use:");
        System.out.println("1. Basic");
        System.out.println("2. Memory-optimised");
        System.out.println("3. CPU-optimised");
        System.out.println("0. Exit");
    }

    static int selectInt(){

        Scanner select = new Scanner(System.in);
        if (select.hasNextInt()) {
            return select.nextInt();
        }
        System.out.println("Invalid data. See you next time.");
        return 0;
    }
}
