package org.example;
import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String [] parts = input.split(" ");
        System.out.println(parts[0]);
    }
}