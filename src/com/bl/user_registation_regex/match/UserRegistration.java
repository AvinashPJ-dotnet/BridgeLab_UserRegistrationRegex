package com.bl.user_registation_regex.match;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public void addUser() {
        int choice = 0;
        UserDetails userDetails = new UserDetails();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. First Name\n2. Last Name\n3. Email\n4. Phone Number\n5. Password\n0. Exit");
            System.out.println("Enter choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter First Name");
                    String firstName = scanner.next();
                    boolean isFirstName = Pattern.matches("^[A-Z].[a-zA-Z]{2}$", firstName);
                    if (isFirstName) userDetails.setFirstName(firstName);
                    else System.out.println("Please check First Name");
                    break;
                case 2:
                    System.out.println("Enter Last Name");
                    String lastName = scanner.next();
                    boolean isLastName = Pattern.matches("^[A-Z].[a-zA-Z]{2}$", lastName);
                    if (isLastName) userDetails.setLastName(lastName);
                    else System.out.println("Please check Last Name");
                    break;
                case 3:
                    System.out.println("Enter Email");
                    String email = scanner.next();
                    boolean isMailId = Pattern.matches("^[a-z0-9]+[-/+.]*[0-9a-z]*@[a-z0-9]+.[a-z]{2,6}.[a-z]*$", email);
                    if (isMailId) userDetails.setEmail(email);
                    else System.out.println("Please check Email Id");
                    break;
                case 4:
                    System.out.println("Enter Phone number");
                    Number phoneNumber = scanner.nextBigInteger();
                    boolean isPhoneNumber = Pattern.matches("^[1-9]+[0-9]+[0-9]{10}$", phoneNumber.toString());
                    if (isPhoneNumber) userDetails.setPhoneNumber(phoneNumber);
                    else System.out.println("Please check PhoneNumber");
                    break;
                case 5:
                    System.out.println("Enter Password");
                    String password = scanner.next();
                    boolean isPassword = Pattern.matches("^(?=[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[%^_#&$+=@]).{8,20}$", password);
                    if (isPassword) userDetails.setPassword(password);
                    else System.out.println("Please check Password");
                    break;
                case 0:
                    break;
            }
        } while (choice != 0);
    }
}
