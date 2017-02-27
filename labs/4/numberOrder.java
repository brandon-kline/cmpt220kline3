/**
  * file: numberOrder.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 4
  * due date: Febuary 28, 2017
  * version: 1.0
  * 
  */
  
 /**
  * numberOrder
  * 
  * This class allows for the user to enter 10
  * integers and for the integers to be displayed
  * once they are sorted.
  */
  
import java.util.Scanner;
public class numberOrder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] nums = new double [10];
    System.out.print("Enter 10 numbers: ");
    for (int i = 0; i < nums.length; i++)
    nums[i] = input.nextDouble();
    bubSort(nums);
    for (double e: nums) {
      System.out.print(e + " ");
      }
    System.out.println();
    }
	
	 /**
  * bubSort
  * 
  * This class allows for the 10 numbers
  * entered to be sorted and put in order.
  */
  
  public static void bubSort(double[] list) {
    double temporary;
    boolean swap;
    do {
      swap = false;
      for (int i = 0; i < list.length - 1; i++) {
        if (list[i] > list[i + 1]) {
          temporary = list[i];
          list [i] = list[i + 1];
          list [i + 1] = temporary;
          swap = true;
          }
        }
      }
    while (swap);
    }
  }