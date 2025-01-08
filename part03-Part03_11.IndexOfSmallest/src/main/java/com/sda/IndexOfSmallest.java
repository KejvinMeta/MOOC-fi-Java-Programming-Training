package com.sda;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = scanner.nextInt();

            if(number == 9999) {
                break;
            }

            numbers.add(number);
        }

        int smallest = numbers.get(0);
        for (int x : numbers) {
            if (x < smallest) {
                smallest = x;
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}