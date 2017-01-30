  /**
  * file: Lab_1 Prb_3.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 1
  * due date: Jaunuary 31, 2017
  * version: 1.0
  * 
  */
   
  /**
  * gratuityCalc
  * 
  * This class allows for the calculation of 
  * the gratuity rate and total of a bill and
  * is and printed when the program is run.
  */


  import java.util.Scanner;
  public class gratuityCalc {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print(
  "Enter the subtotal and a gratuity rate: ");
  double subtotal = input.nextDouble();
  double gratuityRate = input.nextDouble();
  double gratuity = subtotal * (gratuityRate / 100);
  double total = subtotal + gratuity;
  System.out.println(
  "The gratutity is $" + gratuity + " and total is $" + total);
  }
  }