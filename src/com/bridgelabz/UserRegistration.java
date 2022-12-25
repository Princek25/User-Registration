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
}
