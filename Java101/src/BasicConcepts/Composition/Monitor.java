package BasicConcepts.Composition;

public class Monitor {
  private String model;
  private int size;
  private Resolution nativeResolution; // <-- this is a composite class!

  public Monitor(String model, int size, Resolution nativeResolution) {
    this.model = model;
    this.size = size;
    this.nativeResolution = nativeResolution;
  }

  public String getModel() {
    return model;
  }

  public int getSize() {
    return size;
  }

  public Resolution getNativeResolution() {
    return nativeResolution;
  }

  public void drawPixelAt(int x, int y, String color) {
    System.out.println("Draw pixel at " + x + "." + y + " in " + color + ".");
  }
}
