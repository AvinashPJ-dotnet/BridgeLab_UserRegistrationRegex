package com.bl.user_registation_regex.match;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public void addUser() {
        int choice = 0;
        UserDetails userDetails = new UserDetails();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. First Name\n2. Last Name\n3. Email\n0. Exit");
            System.out.println("Enter choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter First Name");
                    String firstName = scanner.next();
                    boolean isFirstName = Pattern.matches("^[A-Z].[a-zA-Z0-9]{2}$", firstName);
                    if (isFirstName) userDetails.setFirstName(firstName);
                    else System.out.println("Please check First Name");
                    break;
                case 2:
                    System.out.println("Enter Last Name");
                    String lastName = scanner.next();
                    boolean isLastName = Pattern.matches("^[A-Z].[a-zA-Z0-9]{2}$", lastName);
                    if (isLastName) userDetails.setFirstName(lastName);
                    else System.out.println("Please check Last Name");
                    break;
                case 3:
                    System.out.println("Enter Email");
                    String email = scanner.next();
                    boolean isMailId = Pattern.matches("^[a-z0-9]+[-/+.]*[0-9a-z]*@[a-z0-9]+.[a-z]{2,6}.[a-z]*$", email);
                    if (isMailId) userDetails.setFirstName(email);
                    else System.out.println("Please check Email Id Name");
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }
}
