package Exercises.OOP;

public class Main {
  public static void main(String[] args) {
    Burger basicBurger = new Burger("Wheat", "Beyond", "Beyond Burger", 499);
    System.out.println(basicBurger.getPrice());
    basicBurger.addCheese();
    basicBurger.addAvocado();
    System.out.println(basicBurger.getPrice());
    System.out.println(basicBurger.getFullPrice());
  }
}
