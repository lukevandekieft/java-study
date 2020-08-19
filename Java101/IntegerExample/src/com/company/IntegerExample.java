package com.company;

public class IntegerExample {

    public static void main(String[] args) {
        String numberAsString = "2020";
        System.out.println("number As String = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
//        int number = Integer.parseInt("20ee9")  <-- Passing non-int to parseInt is a breaking error!
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println(numberAsString);
        System.out.println(number);

        double doubleNumber = Double.parseDouble(numberAsString);   // <-- Must be String, not int!
        System.out.println(doubleNumber);
    }
}
