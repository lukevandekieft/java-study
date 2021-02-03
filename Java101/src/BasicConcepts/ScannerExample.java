package BasicConcepts;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // <-- this stops code execution and waits for console input

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            // scanner.nextLine();  <-- when using nextInt and you expect further input you should include an extra nextLine to account for "Enter" being pressed
            int age = 2020 - yearOfBirth;

            if(age >= 0 && age <= 120) {
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Invalid date provided.");
        }

        scanner.close();
    }
}
