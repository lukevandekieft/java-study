package BasicConcepts.ArrayAndList;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] intArray = new int[5]; // [0, 0, 0, 0, 0]
    System.out.println(Arrays.toString(intArray)); // NOTE: sout(array) returns an object hash. Arrays.toString() is needed for output
    intArray[4] = 185; // [0, 0, 0, 0, 185]   <-- remember that position 4 is the fifth because of zero
    // intArray[5] = 70;   <-- throws error: we cannot set 6th position on 5 length array
    int[] intArray2 = {1, 2, 3, 4}; // [1, 2, 3, 4]
    System.out.println(Arrays.toString(intArray2));
    // intArray = {1, 2, 3, 4}   <-- throws error: you cannot overwrite an existing array like this. Use for loop if you want to overwrite each

    String[] stringArray = new String[5]; // [null, null, null, null, null]
    System.out.println(Arrays.toString(stringArray));
    // NOTE: String & Object default null, boolean false, int 0

    int[] initialArray = new int[5];
    int[] secondArray = initialArray;
    System.out.println("Initial Array: " + Arrays.toString(initialArray));
    System.out.println("Second Array: " + Arrays.toString(initialArray));
    secondArray[2] = 19483;
    System.out.println("Initial Array after 2nd updated: " + Arrays.toString(initialArray));
    // NOTE: Strings and Arrays are reference types, not value types. That means that any variables created off a reference type will all point to the same address in memory and ALL will change on edits.
    // DE-REFERENCING: removing all pointers to an object so it gets cleared for garbage collection

  }
}

// similarities to JavaScript:
// + .length

// differences:
// + type enforcement available within array - int, String, any
// - no implicit addition to new position with nulls filled in between.
// - cannot override array with new array
