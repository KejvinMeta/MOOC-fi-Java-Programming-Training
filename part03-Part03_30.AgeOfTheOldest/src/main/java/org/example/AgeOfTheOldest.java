package org.example;
import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = Integer.MIN_VALUE;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            int age = Integer.parseInt(parts[1].trim());

            if (age > oldestAge) {
                oldestAge = age;
            }
        }

        System.out.println("Age of the oldest: " + oldestAge);
    }
}