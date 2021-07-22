package edu.pdx.cs410J.mobProgram;
import java.util.*;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static int operation(int num1, int num2, String operator) {

    int result = 0;
    switch(operator){
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "/":
        result = num1 / num2;
        break;
      case "*":
        result = num1 * num2;
      default:
        break;
    }
    return result;
  }

  /*
    parse until 2 integers and an operation
   */
  public static int calculator(Vector<String> list, int index, int finalValue) {
    if(index == list.size() - 1) {
      return finalValue;
    }
    if(checkIfOp(list.get(index))) {
      finalValue = operation(Integer.parseInt(list.get(index - 2)), Integer.parseInt(list.get(index -1)), list.get(index));
      System.out.println(finalValue);
      for(int i = 0; i < 3; ++i) {
        list.removeElementAt(index - 2);
      }
      list.insertElementAt(String.valueOf(finalValue), index - 2);
    }
    return calculator(list, index + 1, finalValue);
  }

  public static boolean checkIfOp(String input) {
    if(input.equals("+") || input.equals("-") || input.equals("/") || input.equals("*")) {
      return true;
    }
    return false;
  }

  public static Vector<String> getVectorList(String[] input) {
    Vector<String> toReturn = new Vector<>();
    for(String current : input) {
      toReturn.add(current);
    }
    return toReturn;
  }

  public static void main(String[] args) {
    //System.err.println("Missing command line arguments");
    args = new String[] {"20", "5", "/"};

    System.out.println(calculator(getVectorList(args), 0, 0));

    System.exit(1);
  }
}