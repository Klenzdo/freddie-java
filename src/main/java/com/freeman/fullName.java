package com.freeman;

import java.util.Scanner;

public class fullName {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        System.out.print("First Name :");
        String firstName = Scanner.next();
        System.out.print("Last Name :");
        String lastName = Scanner.next();
        System.out.println("Full name is : " + firstName    + lastName);

        Scanner.close();
    }
}
