 /**
  * file: areaCalcCircle.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 7, 2017
  * version: 1.0
  * 
  */
  
 /**
  * areaCalcCircle
  * 
  * This class allows for the calculation of the
  * area of circle by having the user enter the 
  * length from the center of the circle to a vertex 
  * to calculate the area.
  */
  
  import java.util.Scanner;
  public class secondary {
  public static void main (String [] args) {
  Scanner input = new Scanner(System.in);
  System.out.print
  ("Enter the length from the center to a vertex: ");
  double radius = input.nextDouble();
  double side = (2 * radius) * Math.sin (Math.PI / 5);
  double area = (5 * Math.pow(side , 2)) /
  (4 * Math.tan(Math.PI / 5));
  System.out.printf
  ("The area of a pentagon is %5.2f\n", area);
  }
  }