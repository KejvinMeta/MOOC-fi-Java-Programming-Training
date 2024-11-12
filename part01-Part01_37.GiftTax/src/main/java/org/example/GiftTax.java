package org.example;
import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double giftTax = 0;

        System.out.println("Value of the gift? ");
        int value = Integer.valueOf(scanner.nextLine());

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value <= 25000) {
            giftTax = 100 + (value-5000) * 0.08;
        } else if (value <= 55000) {
            giftTax = 1700 + (value-25000) * 0.10;
        } else if (value <= 200000) {
            giftTax = 4700 + (value - 55000) * 0.12;
        } else if (value <= 1000000) {
            giftTax = 22100 + (value- 200000) * 0.15;
        } else {
            giftTax = 142100 + (value - 1000000) * 0.17;
        }

        if (giftTax > 0) {
            System.out.println("Tax: " + giftTax);
        }
    }
}