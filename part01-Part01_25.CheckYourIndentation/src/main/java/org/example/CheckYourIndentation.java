package org.example;
import java.util.Scanner;

public class CheckYourIndentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give another number: ");
        int second = Integer.valueOf(scanner.nextLine());

        if (first == second) {
            System.out.println("Same!");
        } else if (first>second) {
            System.out.println("The first was larger than the second!");
        }else {
            System.out.println("The second was larger than the first!");
        }
    }
}