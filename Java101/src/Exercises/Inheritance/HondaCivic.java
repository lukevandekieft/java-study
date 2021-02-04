package Exercises.Inheritance;

public class HondaCivic extends Car {
  private int price;

  public HondaCivic(String name, String size, int wheels, int doors, int price) {
    super(name, size, wheels, doors);
    this.price = price;
  }
}
