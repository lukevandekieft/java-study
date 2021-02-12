package Exercises.OOP;

import java.math.BigDecimal;

public class Burger {
  private String roll;
  private String protein;
  private String name = "Basic Burger";
  private int basePrice = 299;
  private boolean onions = false;
  private int onionsPrice = 45;
  private boolean cheese = false;
  private int cheesePrice = 70;
  private boolean avocado = false;
  private int avocadoPrice = 120;

  public String getPrice () {
    double price = basePrice;
    if (onions) {
      price += onionsPrice;
    }
    if (cheese) {
      price += cheesePrice;
    }
    if (avocado) {
      price += avocadoPrice;
    }
    return "Current price is " + (price/100);
  }

  public String getFullPrice () {
    return "Base price is: " + (double) basePrice/100 + ". Avocado price is: " + (double) avocadoPrice/100 + ". Price for fully loaded burger is: " + (double) (basePrice + onionsPrice + cheesePrice + avocadoPrice)/100 + ".";
  }

  public Burger(String roll, String protein) {
      this.roll = roll;
      this.protein = protein;
  }
}
