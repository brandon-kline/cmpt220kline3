/**
  * file: letterCounter.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 4
  * due date: Febuary 28, 2017
  * version: 1.0
  * 
  */
  
 /**
  * letterCounter
  * 
  * This class allows for the user enter a
  * string of letters and displays the
  * number of letters in that string.
  */

import java.util.Scanner;
public class letterCounter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    System.out.println(
	"The number of letters in the string \"" +
    str + "\": " + count(str));
    }
	
	 /**
  * count
  * 
  * This class allows for the counting of
  * the number of letters in the string that
  * the user entered.
  */
  
  public static int count(String s) {
    int letternum = 0;
    for(int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i)))
      letternum++;
      }
    return letternum;
    }
  }