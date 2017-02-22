/**
  * file: greaterThan12000.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 3
  * due date: Febuary 21, 2017
  * version: 1.0
  * 
  */
  
 /**
  * greaterThan12000
  * 
  * This class allows for the calculation of the 
  * smallest integer such that that integer 
  * squared is greater than 12000.
  */
  
import java.util.Scanner;
public class greaterthan12000 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = 0;
    while (Math.pow(num, 2) <= 12000) {
      while (Math.pow(num, 2) < 12000) {
        num++;
        }
      System.out.println("The smallest integer n 
	  such that n^2 is greater than 12000: " + num);
      }
    }
  }