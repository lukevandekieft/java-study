package com.company;

public class FlowStatements {
  public static void main(String[] args) {
    System.out.println(SwitchExample(6));
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
}
