package BasicConcepts;

public class Polymorphism {
  public static void main(String[] args) {
    SilentHill silentHill = new SilentHill();
    ThatOneMovie thatOneMovie = new ThatOneMovie();
    LionKing lionKing = new LionKing();

    System.out.println(silentHill.getPlot());
    System.out.println(thatOneMovie.getPlot()); // This one defaults to Movie's plot since thatOneMovie doesn't have one - polymorphism!
    System.out.println(lionKing.getPlot());
  }
};


class Movie {
  private String name;

  public String getPlot() {
    return "No plot info available";
  }

  public Movie(String name) {
    this.name = name;
  }
}

class SilentHill extends Movie {
  public SilentHill() {
    super("Silent Hill");
  }
  @Override
  public String getPlot() {
    return "Rose needs to find Sharon";
  }
}

class ThatOneMovie extends Movie {
  public ThatOneMovie() {
    super("That One Movie...?");
  }
}

class LionKing extends Movie {
  public LionKing() {
    super("The Lion King");
  }

  @Override
  public String getPlot() {
    return "Simba grows up to be a fine young lion";
  }
}

