package edu.pdx.cs410J.greencod2;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    String string = null;
    int num = 0;
    String out = null;
    if(args[0] == null) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    } else {
      string = args[0];
      num = Integer.parseInt(string);
    }
    if(num % 3 == 0) {
      System.out.println("Foo");
    }
    if(num % 5 == 0) {
      System.out.println("Bar");
    }
    if(num % 7 == 0) {
      System.out.println("Qix");
    }
  }
}