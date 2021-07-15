package edu.pdx.cs410J.MattCody;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


  public void topLine(String orig, int length){
    int num = 0;
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < length; i++){
      num = Integer.parseInt(String.valueOf(orig.charAt(i)));

      switch (num) {
        case 0: result.append(" _ ");
        break;
        case 1: result.append("   ");
          break;
        case 2: result.append(" _ ");
          break;
        case 3: result.append(" _ ");
          break;
        case 4: result.append("   ");
          break;
        case 5: result.append(" _ ");
          break;
        case 6: result.append(" _ ");
          break;
        case 7: result.append(" _ ");
          break;
        case 8: result.append(" _ ");
          break;
        case 9: result.append(" _ ");
          break;
        default:
          break;
      }
      result.append(" ");
    }
    System.out.println(result);
  }
  public void midLine(String orig, int length){
    int num = 0;
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < length; i++){
      num = Integer.parseInt(String.valueOf(orig.charAt(i)));

      switch (num) {
        case 0: result.append("| |");
          break;
        case 1: result.append("  |");
          break;
        case 2: result.append(" _|");
          break;
        case 3: result.append(" _|");
          break;
        case 4: result.append("|_|");
          break;
        case 5: result.append("|_ ");
          break;
        case 6: result.append("|_ ");
          break;
        case 7: result.append("  |");
          break;
        case 8: result.append("|_|");
          break;
        case 9: result.append("|_|");
          break;
        default:
          break;
      }
      result.append(" ");
    }
    System.out.println(result);
  }
  public void bottomLine(String orig, int length){
    int num = 0;
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < length; i++){
      num = Integer.parseInt(String.valueOf(orig.charAt(i)));

      switch (num) {
        case 0: result.append("|_|");
          break;
        case 1: result.append("  |");
          break;
        case 2: result.append("|_ ");
          break;
        case 3: result.append(" _|");
          break;
        case 4: result.append("  |");
          break;
        case 5: result.append(" _|");
          break;
        case 6: result.append("|_|");
          break;
        case 7: result.append("  |");
          break;
        case 8: result.append("|_|");
          break;
        case 9: result.append(" _|");
          break;
        default:
          break;
      }
      result.append(" ");
    }
    System.out.println(result);
  }

  public static void main(String[] args) {

    if(args.length == 0) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    } else if (args.length < 1) {
      System.err.println(("Too many args, submit only one number"));
      System.exit(1);
    }

    int l = args[0].length();
    Kata kata = new Kata();
    kata.topLine(args[0], l);
    kata.midLine(args[0], l);
    kata.bottomLine(args[0], l);
  }
}