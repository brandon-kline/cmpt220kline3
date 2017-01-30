  /**
  * file: Lab_1 Prb_2.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 1
  * due date: Jaunuary 31, 2017
  * version: 1.0
  * 
  */
   
  /**
  * thermometer
  * 
  * This class allows for the conversion of a 
  * number in degrees Celsius into degrees 
  * Fahrenheit and printed when theprogram is run.
  */

  import java.util.Scanner;
  public class thermometer {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print(
  "Enter a degree in Celsius: ");
  double celsius = input.nextDouble();
  double fahrenheit = 9.0 / 5 * celsius + 32;
  System.out.println(
  celsius + " Celsius is " + fahrenheit
  + " Fahrenheit"); 
  }
  }
