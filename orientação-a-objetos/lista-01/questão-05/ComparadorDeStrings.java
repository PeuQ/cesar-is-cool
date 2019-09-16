package Questao05;

import java.util.Scanner;

public class ComparadorDeStrings {

  /* method: check if string is reversed */
  public static boolean isReverseString(String firstString, String secondString) {
    String reverseString = "";

    /* revert string */
    for (int index = secondString.length() - 1; index >= 0; index--) {
      reverseString += secondString.charAt(index);
    }

    return (firstString.equals(reverseString)) ? true : false;
  }

  /* method: main */
  public static void main(String[] args) {

    /* constructors */
    Scanner scanner = new Scanner(System.in);
    ComparadorDeStrings comparadorDeStrings = new ComparadorDeStrings();

    /* user input */
    System.out.println("Insert a word: ");
    String stringOne = scanner.next();

    System.out.println("Insert another word: ");
    String stringTwo = scanner.next();

    scanner.close();

    /* program output */
    System.out.println("result: " + comparadorDeStrings.isReverseString(stringOne, stringTwo));

    String statement = (comparadorDeStrings.isReverseString(stringOne, stringTwo) == true) ? "ARE" : "ARE NOT";
    System.out.println(stringOne + " and " + stringTwo + " " + statement + " mirrored strings!");
  }
}
