package org.example;

public class Greatest {
    public static void main(String[] args) {
        int answer = greatest(2,7,3);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest (int number1, int number2, int number3) {
        return Math.max(number1, Math.max(number2, number3));
    }
}