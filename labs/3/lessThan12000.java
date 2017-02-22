/**
  * file: lessThan12000.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 3
  * due date: Febuary 21, 2017
  * version: 1.0
  * 
  */
  
 /**
  * lessThan12000
  * 
  * This class allows for the calculation of the
  * largest integer such that that integer cubed
  * is less than 12000.
  */
  
import java.util.Scanner;
public class lessthan12000 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = 0;
    while (Math.pow(num + 1, 3) < 12000) {
      num++;
      }
    System.out.println("The largest integer n such 
	that n^3 is less than 12000: " + num);
    }
  }