   /**
  * file: areaCalcPolygon.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 7, 2017
  * version: 1.0
  * 
  */
  
 /**
  * areaCalcPolygon
  * 
  * This class allows for the calculation of the
  * area of polygon by having the user enter the 
  * number of sides in the polygon and the length 
  * of a polygon side to multiply the two numbers
  * and calculate the area.
  */
  
 import java.util.Scanner;
  public class areaCalcPolygon {
  public static void main (String [] args) {
  Scanner input = new Scanner (System.in);
  System.out.print("Enter the number of sides: ");
  int sidenum = input.nextInt();
  System.out.print("Enter the side length: ");
  double sidelength = input.nextInt();
  double area = (sidenum * Math.pow(sidelength , 2)
  / (4 * Math.tan(Math.PI / sidenum)));
  System.out.println
  ("The area of the polygon is " + area);
  }
  }