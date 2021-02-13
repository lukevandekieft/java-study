package Exercises.OOP;

public class HealthyBurger extends Burger {
    private boolean sprouts = false;
    private int sproutsPrice = 125;
    private boolean lettuce = true;
    private int lettucePrice = 30;

  public HealthyBurger(String protein, int price) {
    super("Brown Rye", protein, "Healthy Burger", price);
  }

  public void addSprouts() {
    sprouts = true;
  }

  public void addLettuce() {
    lettuce = true;
  }

  @Override
  public String getPrice() {
    String basePrice = super.getPrice();
    if (sprouts) {
      basePrice += " Added sprouts for " + sproutsPrice + ".";
    }
    if (lettuce) {
      basePrice += " Added lettuce for " + lettucePrice + ".";
    }
    return basePrice;
  }

  @Override
  public void addCheese() {
    System.out.println("Cannot add cheese - that's not healthy!");
  }
}
