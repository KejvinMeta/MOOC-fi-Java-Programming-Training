package com.sda;
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfPositiveNumbers = 0;
        int numberOfPositiveNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                numberOfPositiveNumbers++;
                sumOfPositiveNumbers += number;
            }
        }
        if (numberOfPositiveNumbers > 0) {
            double average = sumOfPositiveNumbers / numberOfPositiveNumbers;
            System.out.println(average);
        }else {
            System.out.println("Cannot calculate the average");
        }
    }
}