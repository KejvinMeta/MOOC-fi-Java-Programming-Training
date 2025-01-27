package com.sda;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer>numbers = new ArrayList<>();

        int sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1){
                break;
            }

            numbers.add(input);
        }

        for (int number: numbers) {
             sum += number;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Average: " + average);
    }
}