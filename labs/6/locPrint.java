/**
  * file: locPrint.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 6
  * due date: April 18, 2017
  * version: 1.0
  * 
  */

 /**
  * locPrint
  * 
  * This class allows for the calling of the
  * locArray class and prints the location of
  * the largest element in an array entered by
  * the user.
  */

import java.util.Scanner;
public class locPrint {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of rows and columns in the array: ");
  int rows = input.nextInt();
  int columns = input.nextInt();
  double[][] array = new double[rows][columns]; 
  System.out.println("Enter the array: ");
  for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
      array[i][j] = input.nextDouble();
      }
    }
  locArray max = locateLargest(array);
  System.out.println("The location of the largest element is " +
  max.maxValue + " at (" + max.row + ", " + max.column + ")");
  }
public static locArray locateLargest(double[][] a) {
  return new locArray(a);
  }
}