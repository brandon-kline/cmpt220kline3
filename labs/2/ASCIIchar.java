/**
  * file: ASCIIchar.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 14, 2017
  * version: 1.0
  * 
  */
  
 /**
  * ASCIIchar
  * 
  * This class allows for the conversion of a  
  * number in ASCII code to a corressponding
  * letter in English.
  */
  
  import java.util.Scanner;
  public class ASCIIchar {
  public static void main (String [] args) {
  Scanner input = new Scanner (System.in);
  System.out.print("Enter an ASCII code: ");
  int code = input.nextInt();
  System.out.print
  ("The character for ASCII code "
  +code +" is ");
  System.out.print((char)code);
  }
  }