/**
  * file: listPartition.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 5
  * due date: March 28, 2017
  * version: 1.0
  * 
  */
  
 /**
  * listPartition
  * 
  * This class allows for the user to enter a list
  * and for the list to be printed after it is 
  * partitioned.
  */

import java.util.Scanner;
public class listPartition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println
	("First number = size of array, second number = pivot ");
    System.out.print("Enter a list:");
    int size = input.nextInt();
    int[] list = new int[size];
    for 
	(int i = 0; i < size; i++) list[i] = input.nextInt();
    partition(list);
    }
	
	 /**
  * partition
  * 
  * This class allows for the partitioning of a 
  * given list entered by the user.
  */
	
  public static int partition(int[] list) {
    int first = 0;
    int low = first + 1;
    int high = list.length - 1;
    int pivot = list[first];
    while (high > low) {
      while (low <= high && list[low] <= pivot) low++;
      while (low <= high && list[high] > pivot) high--;
      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
        }
      }
    while (high >= low && list[high] >= pivot) high--;
    if (high > first) {
      int temp = list[high];
      list[high] = list[first];
      list[first] = temp;
      return high;
      } 
    else {
      return first;
      }
    }
  }