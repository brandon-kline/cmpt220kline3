/**
  * file: letter2Num.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 14, 2017
  * version: 1.0
  * 
  */
  
 /**
  * letter2Num
  * 
  * This class allows for the conversion of a 
  * letter in English to a number in the style of 
  * a traditional cellphone keypad.
  */
  
  import java.util.Scanner;
  public class letter2Num {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a letter: ");
  String letter = input.nextLine();
  char symbol = letter.charAt(0);
  symbol = Character.toUpperCase(symbol);
  int number = 0;
  if (Character.isLetter(symbol));
  {
  if (symbol >= 'W')
  number = 9;
  else if (symbol >= 'T')
  number = 8;
  else if (symbol >= 'P')
  number = 7;
  else if (symbol >= 'M')
  number = 6;
  else if (symbol >= 'J')
  number = 5;
  else if (symbol >= 'G')
  number = 4;
  else if (symbol >= 'D')
  number = 3;
  else if (symbol >= 'A')
  number = 2;
  System.out.println
  ("The corresponding number is " + number);
  }
  else
  System.out.println(ch + " is an invalid input");
  }
  }