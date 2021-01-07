package com.company;

// INHERITANCE EXAMPLE

public class DogInheritance extends Animal {
  private int eyes;
  private int legs;
  private int tail;

  public DogInheritance(String name, int size, int weight, int eyes, int legs, int tail) {

    // all dogs have brains & bodies so we are removing parameters and instead passing fixed values
    super(name, 1, 1, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
  }

  // we can override an inherited function to give it updated functionality
  @Override
  public void eat() {
    System.out.println("CHEW then...");
    super.eat();
  }
}
