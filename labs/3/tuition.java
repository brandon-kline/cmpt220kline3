/**
  * file: tuition.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 3
  * due date: Febuary 21, 2017
  * version: 1.0
  * 
  */
  
 /**
  * tuition
  * 
  * This class allows for the calculation of four
  * years of tuition as well as the cost of tuition
  * in ten years.
  */
  
import java.util.Scanner;
public class tuition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int total = 0;
    int cost = 10000;
    int costYearTen = 0;
    for (int year = 1; year <= 14; year++) {
      cost += (cost * 0.05);
      if (year < 10)
      total += cost;
      if (year == 10)
      costYearTen = cost;
      }
    System.out.println
	("Tuition in ten years: $" + costYearTen);
    System.out.println("Total cost for four years' 
	worth of tuition" + " after the tenth year: $" + total);
    }
  }
