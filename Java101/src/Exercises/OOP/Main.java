package Exercises.OOP;

public class Main {
  public static void main(String[] args) {
    Burger basicBurger = new Burger("Wheat", "Beyond");
    String price = basicBurger.getPrice();
    System.out.println(price);
    System.out.println(basicBurger.getFullPrice());
  }
}
