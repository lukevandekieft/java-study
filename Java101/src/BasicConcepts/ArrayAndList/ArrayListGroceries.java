package BasicConcepts.ArrayAndList;

import java.util.ArrayList;

public class ArrayListGroceries {
  private ArrayList<String> groceryList = new ArrayList<String>();

  public void addGroceryItem(String item) {
    groceryList.add(item);
  }

  public void printGroceryList() {
    System.out.println("You have " + groceryList.size() + " items in your grocery list.");
    for(int i=0; i < groceryList.size(); i++) {
      System.out.println(i+1 + ". " + groceryList.get(i));
    }
  }

  public void modifyGroceryItem(int position, String newItem) {
    groceryList.set(position, newItem);
  }

  public String findItem(String searchItem) {
//    boolean exists = groceryList.contains(searchItem);  <-- example for checking if it contains element
    int position = groceryList.indexOf(searchItem);
    if (position >= 0) {
      return groceryList.get(position);
    }
    return null;
  }

  public ArrayList<String> copyArrayList(ArrayList<String> oldArrayList) {
    // ArrayList<int> variable    <-- throws error "type cannot be primitive" - array lists need classes
    ArrayList<String> newArrayList = new ArrayList<String>();
    newArrayList.addAll(oldArrayList);

    // OR: ArrayList<String> newArrayList = new ArrayList<String>(oldArrayList);
    return newArrayList;
  }
}
