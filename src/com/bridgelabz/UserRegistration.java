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
    public void validLastName(){
        System.out.print("Enter Last Name: ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Last Name");
        } else System.out.println("Invalid Last Name");
    }
}
