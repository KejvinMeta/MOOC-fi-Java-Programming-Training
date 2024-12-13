package org.example;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfNumbers = 0;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;

        System.out.println("Give numbers: ");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum += number;
            numberOfNumbers++;


            if (number % 2 ==0){
                numberOfEvenNumbers++;
            }else {
                numberOfOddNumbers++;
            }

            
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);

        double average = (double) sum/numberOfNumbers;
        System.out.println("Average: " + average);

        System.out.println("Even: " + numberOfEvenNumbers);
        System.out.println("Odd: " + numberOfOddNumbers);
    }
}