package org.example;
import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String string = scanner.nextLine();

        System.out.println("Give an integer: ");
        int integer = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double: ");
        double inputDouble = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean: ");
        boolean inputBoolean = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + inputDouble);
        System.out.println("You gave the boolean " + inputBoolean);

    }
}