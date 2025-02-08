package org.example;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int [5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Give two indices to swap: ");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        int temporary = numbers[index1];
        numbers [index1] = numbers[index2];
        numbers [index2] = temporary;

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}