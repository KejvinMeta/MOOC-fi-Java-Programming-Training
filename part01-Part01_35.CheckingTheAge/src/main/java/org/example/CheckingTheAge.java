package org.example;
import java.util.Scanner;

public class CheckingTheAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.valueOf(scanner.next());

        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        }else {
            System.out.println("OK");
        }
    }
}