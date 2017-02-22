/**
  * file: intDigitSum.java
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
  * This class allows for the integers within a 
  * three digit number to be entered and printed.
  */
  
import java.util.Scanner;
public class intDigitSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a integer: ");
    long num = input.nextLong();
    System.out.println("The sum of the digits in "
	+ num + " is " + add(num));
    }
	
/**
  * add
  * 
  * This class allows for the integers within an 
  * entered three digit number to be added together 
  * into a sum.
  */
  
  public static long add(long innum) {
    int sum = 0;
    while (innum > 0) {
    sum += innum % 10;
    innum /= 10;
    }
  return sum;
  }
}