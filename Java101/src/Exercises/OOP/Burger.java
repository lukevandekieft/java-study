package Exercises.OOP;

import java.math.BigDecimal;

public class Burger {
  private String roll;
  private String protein;
  private String name;
  private int basePrice;
  private boolean onions = false;
  private int onionsPrice = 45;
  private boolean cheese = false;
  private int cheesePrice = 70;
  private boolean avocado = false;
  private int avocadoPrice = 120;

  public String getPrice () {
    double price = basePrice;
    String additions = "";
    if (onions) {
      price += onionsPrice;
      additions += "Onions added. ";
    }
    if (cheese) {
      price += cheesePrice;
      additions += "Cheese added. ";
    }
    if (avocado) {
      price += avocadoPrice;
      additions += "Avocado added. ";
    }
    return "Current price is " + (price/100) + ". " + additions;
  }

  public void addAvocado() {
    avocado = true;
  }

  public void addCheese() {
    cheese = true;
  }

  public void addOnions() {
    onions = true;
  }

  public String getFullPrice () {
    return "Base price is: " + (double) basePrice/100 + ". Avocado price is: " + (double) avocadoPrice/100 + ". Price for fully loaded burger is: " + (double) (basePrice + onionsPrice + cheesePrice + avocadoPrice)/100 + ".";
  }

  public Burger(String roll, String protein, String name, int price) {
      this.roll = roll;
      this.protein = protein;
      this.name = name;
      this.basePrice = price;
  }
}
