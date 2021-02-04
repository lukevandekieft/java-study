package BasicConcepts.Composition;

public class Motherboard {
  private String model;
  private int ram;

  public Motherboard(String model, int ram) {
    this.model = model;
    this.ram = ram;
  }

  public String getModel() {
    return model;
  }

  public int getRam() {
    return ram;
  }
}
