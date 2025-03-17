package org.example;

import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String [] avClub = input.split(" ");

        for (String word : avClub) {
            if (word.contains("av")){
                System.out.println(word);
            }
        }
    }
}