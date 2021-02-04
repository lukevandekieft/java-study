package BasicConcepts.Composition;

public class Main {
  public static void main(String[] args) {
    Monitor monitor = new Monitor("Acer 1040", 20, new Resolution(15, 10));
    Motherboard motherboard = new Motherboard("MSI Infinite", 32);
    Computer computer = new Computer(monitor, motherboard);
    computer.getMonitor().drawPixelAt(15, 20, "red");
  }
}
