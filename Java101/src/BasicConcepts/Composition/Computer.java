package BasicConcepts.Composition;

public class Computer {
  private Monitor monitor;
  private Motherboard motherboard;

  public Computer(Monitor monitor, Motherboard motherboard) {
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  public Monitor getMonitor() {
    return monitor;
  }

  public Motherboard getMotherboard() {
    return motherboard;
  }
}
