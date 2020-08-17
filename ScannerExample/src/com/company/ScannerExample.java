package com.company;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // <-- this stops code execution and waits for console input

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        int age = 2020 - yearOfBirth;
//        scanner.nextLine();  <-- when using nextInt and you expect further input you should include an extra nextLine to accout for "Enter" being pressed

        System.out.println("Your name is " + name + " and you are " + age + " years old.");
        scanner.close();
    }
}
