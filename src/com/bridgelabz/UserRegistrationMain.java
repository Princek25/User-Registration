package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to Enter First Name ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                userRegistration.validFirstName();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}