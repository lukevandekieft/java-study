package com.company;

public class Main {
  public static void main(String[] args) {

    Animal animal = new Animal("Animal", 1, 1, 5, 5);
    DogInheritance dog = new DogInheritance("Pomeranian", 2, 2, 2, 4, 4);

    // since dog extends dog it's able to use animal's "eat" function
    dog.eat();
  }
}
