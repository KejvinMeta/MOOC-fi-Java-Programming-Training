package com.sda;
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>names = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

        names.add(input);
        }

        System.out.print("Search for? ");
        String name = scanner.next();

        if(names.contains(name)){
            System.out.println(name + " was found!");
        } else {
            System.out.println(name + " was not found!");
        }
    }
}