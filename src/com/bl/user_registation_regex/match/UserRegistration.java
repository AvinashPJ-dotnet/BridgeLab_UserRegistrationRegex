package com.bl.user_registation_regex.match;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public void addUser() {
        UserDetails userDetails = new UserDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. First Name");
        String firstName = scanner.next();
        boolean isFirstName = Pattern.matches("^[A-Z].[a-zA-Z0-9]{2}$", firstName);
        if (isFirstName) userDetails.setFirstName(firstName);
        else System.out.println("Please check First Name");
    }
}
