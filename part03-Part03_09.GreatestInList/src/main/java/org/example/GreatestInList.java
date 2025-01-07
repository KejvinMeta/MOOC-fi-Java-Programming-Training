package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();

        while (true) {
            int number = scanner.nextInt();

            if (number == -1){
                break;
            }
            
            numbers.add(number);
        }

        int greatest = numbers.get(0);

        for(int i = 0; i<numbers.size(); i++){
            int next = numbers.get(i);
            if(next > greatest) {
                greatest = next;
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}