  /**
  * file: numOrder.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 7, 2017
  * version: 1.0
  * 
  */
  
 /**
  * numOrder
  * 
  * This class allows for the ordering of a set
  * of 3 numbers that are currently out of order.
  */
  
  import java.util.Scanner;
  public class numOrder {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter three integers: ");
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  int num3 = input.nextInt();
  int swap;
  if (num2 < num1 || num3 < num1)
  {
  if (num2 < num1) {
  swap = num1;
  num1 = num2;
  num2 = swap;
  }
  if (num3 < num1) {
  swap = num1;
  num1 = num3;
  num3 = swap;
  } {
  if (num3 < num2) {
  swap = num2;
  num2 = num3;
  num3 = swap;
  }
  }
  System.out.print(num1 + "" + num2 + "" + num3);
  }
  }
  }