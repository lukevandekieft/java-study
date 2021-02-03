package BasicConcepts.ClassesAndConstructors;

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

  // invokes parent move
  // because "walk" uses super.move it is tied to its parent "move" function
  public void walk() {
    super.move(5);
  }

  // invokes override move
  // by using regular move it'll look for the most relevant function of that name, in this case @Override move
  public void run() {
    move(20);
  }

  @Override
  public void move(int speed) {
    System.out.println("SPECIAL move!");
    super.move(speed);
  }
}
