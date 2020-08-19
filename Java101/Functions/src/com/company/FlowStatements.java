package com.company;

import java.sql.SQLOutput;

public class FlowStatements {
  public static void main(String[] args) {
    System.out.println("Switch example: " + SwitchExample(6));
    System.out.println("For Loop example: " + ForLoopExample(5));
    WhileLoopExample(5);
    DoWhileLoopExample(3);
  }

  public static Object SwitchExample(int day) {
    switch(day) {
      case 5:
        return "It's Friday";
      case 6:
        return "It's Saturday";
      case 7:
        return "It's Sunday";
      default:
        return "This is not a weekend day";
    }
  }

  // for loops are basically the same as JS
  public static Object ForLoopExample(int squareValue) {
    int multiplier = 1;
    for(int i=1; i<=squareValue; i++) {
      multiplier = multiplier * 2;
    }
    return multiplier;
  }

  public static void WhileLoopExample(int countdown) {
    while (countdown > 0) {
      System.out.println("Count " + countdown + "...");
      countdown--;
    }
    System.out.println("Blast off!!");
  }

  public static void DoWhileLoopExample(int countdown) {
    do {
      System.out.println("Count " + countdown + "...");
      countdown--;
    } while (countdown > 0);
    System.out.println("Blast off!!");
  }
}
