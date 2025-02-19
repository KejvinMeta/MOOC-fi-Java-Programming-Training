package com.sda;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer>numbers = new ArrayList<>();
        int sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            numbers.add(input);
        }

        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}