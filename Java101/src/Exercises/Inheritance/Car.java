package Exercises.Inheritance;

public class Car extends Vehicle {
  private int wheels;
  private int doors;
  private int currentGear;

  public Car(String name, String size, int wheels, int doors) {
    super(name, size);
    this.wheels = wheels;
    this.doors = doors;
    this.currentGear = 1;
  }

  public void setCurrentGear(int currentGear) {
    this.currentGear = currentGear;
    System.out.println("Current Gear Changes to " + this.currentGear + ".");
  }
}
