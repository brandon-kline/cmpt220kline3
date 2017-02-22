/**
  * file: palindromeCheck.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 3
  * due date: Febuary 21, 2017
  * version: 1.0
  * 
  */
  
 /**
  * intDigitSum
  * 
  * This class allows for an integer to be entered
  * and printed.
  */
  
import java.util.Scanner;
public class palindromeCheck {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    System.out.println(num + (Pal (num) ? " is " :
	" is not ") + "a palindrome.");
    }
	
/**
  * Pal
  * 
  * This class calls the reverse class to see if the
  * integer entered is a palindrome.
  */
  
  public static boolean Pal(int num) {
    return num == reverse(num) ? true : false;
    }
	
	/**
  * reverse
  * 
  * This class checks to see if the
  * integer entered is a palindrome.
  */
  
  public static int reverse(int num) {
    String reverse = "";
    String n = num + "";
    for (int i = n.length() - 1; i >= 0; i--) {
      reverse += n.charAt(i);
      }
    return Integer.parseInt(reverse);
    }
  }