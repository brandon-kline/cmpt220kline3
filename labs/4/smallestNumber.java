/**
  * file: smallestNumber.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 4
  * due date: Febuary 28, 2017
  * version: 1.0
  * 
  */
  
 /**
  * smallestNumber
  * 
  * This class allows for the user to enter 10
  * integers and for the the minimum value 
  * among the integers to be displayed.
  */

import java.util.Scanner;
public class smallestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] nums = new double [10];
    System.out.print("Enter 10 numbers: ");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = input.nextDouble();
      }
    System.out.println(
	"The minimum number is: " + minimum(nums));
    }
	
 /**
  * minimum
  * 
  * This class allows for the system to sort
  * through the array and return the smallest
  * number entered.
  */
  
  public static double minimum(double[] array) {
    double minimum = array[0];
    for (double i: array) {
      if (i < minimum)
      minimum = i;
      }
    return minimum;
    }
  }