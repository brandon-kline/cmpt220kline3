   /**
  * file: Lab_1 Prb_4.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 1
  * due date: Jaunuary 31, 2017
  * version: 1.0
  * 
  */
   
   /**
  * digitCalc
  * 
  * This class allows for the addition 
  * of digits of a number,which are then 
  * totaled and printed when the program 
  * is run.
  */

  import java.util.Scanner;
  public class digitCalc {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("
  Enter a number between 0 and 1000: ");
  int num = input.nextInt();
  int lessThanten = num % 10;
  num /= 10;
  int ten = num % 10;
  number /= 10;
  int hundred = num % 10;
  num /= 10;
  int sum = hundred + ten + lessThanten;	
  System.out.println(
  "The sum of the digits is " + sum);
  }
  }