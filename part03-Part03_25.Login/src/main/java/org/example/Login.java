package org.example;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if((username.equals("alex") && password.equals("sunshine")) ||
                ((username.equals("emma") && password.equals("haskell")))){
            System.out.println("You have successfully logged in!");
        }else {
            System.out.println("Incorrect username or password!");
        }
    }
}