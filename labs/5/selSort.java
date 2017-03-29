/**
  * file: selSort.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 28, 2017
  * version: 1.0
  * 
  */
  
 /**
  * selSort
  * 
  * This class allows for the user to enter 10
  * numbers and for the numbers to be displayed
  * once they are sorted.
  */

import java.util.Scanner;
public class selSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] nums = new double[10]; 
    System.out.print("Enter ten numbers: ");
    for (int a = 0; a < nums.length ; a++)
    nums[a] = input.nextDouble();
    selectionSort(nums);
    for (double b: nums) 
    System.out.print(b + " ");
    System.out.println();
    }
	
	 /**
  * sort
  * 
  * This class sorts the ten numbers entered by
  * the user from lowest to highest, in order.
  */

	
  public static void sort(double[] list) {
    for (int a = list.length - 1; a >= 0; a--) {
      double currentMax = list[a];
      int currentMaxIndex = a;
      for (int c = a - 1; c >= 0; c--) {
        if (currentMax < list[c]) {
          currentMax = list[c];
          currentMaxIndex = c;
          }
        }
      if (currentMaxIndex != a) {
        list[currentMaxIndex] = list[a];
        list[a] = currentMax;
        }
      }
    }
  }