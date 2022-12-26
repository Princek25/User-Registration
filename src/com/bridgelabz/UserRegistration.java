package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner scanner = new Scanner(System.in);

    public void validFirstName() {
        System.out.print("Enter First Name: ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid First Name");
        } else System.out.println("Invalid First Name");
    }

    public void validLastName() {
        System.out.print("Enter Last Name: ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Last Name");
        } else System.out.println("Invalid Last Name");
    }

    public void validEmail() {
        System.out.print("Enter Email ID: ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9.]*@[a-zA-Z0-9.]+[.][a-z]+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Email ID");
        } else System.out.println("Invalid Email ID");
    }

    public void validMobile() {
        System.out.print("Enter Mobile No: ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(0|91)?[6789][0-9]{9}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Mobile Number");
        } else System.out.println("Invalid Mobile Number");
    }

    public void validPassword() {
        System.out.print("Enter Password (Minimum 8 Characters): ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(".{8,}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else System.out.println("Invalid Password");
    }

    public void validUpperCasePassword() {
        System.out.print("Enter Password (Minimum 8 Characters): ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z].{7,}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else System.out.println("Invalid Password");
    }

    public void validNumericPassword() {
        System.out.print("Enter Password (1 Numeric Character): ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z][0-9].{6,}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else System.out.println("Invalid Password");
    }

    public void valid1SpecialCharPassword() {
        System.out.print("Enter Password (1 Special Character): ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z][0-9][@$!%*#?&].{5,}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else System.out.println("Invalid Password");
    }
}
