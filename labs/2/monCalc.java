  /**
  * file: monCalc.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 7, 2017
  * version: 1.0
  * 
  */
  
 /**
  * monCalc
  * 
  * This class allows for the calculation of the
  * number of days in a given month, including leap
  * years in which Febuarry is 29 days by calculating
  * a given month and year as integers.
  */
  
  import java.util.Scanner;
  public class monCalc {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the month as integer: ");
  int mon = input.nextInt();
  System.out.print("Enter the year as integer: ");
  int year = input.nextInt();
  boolean leap = 
  (year % 4 == 0 && year % 100 != 0) ||
  (year % 400 == 0);
  switch (mon) {
  case 1: System.out.println(
  "January " + year + " has 31 days"); break;
  case 2: System.out.println("February " + year +
  " has" +
  ((leap) ? " 29 days" : " 28 days")); break;
  case 3: System.out.println(
  "March " + year + " has 31 days"); break;
  case 4: System.out.println(
  "April " + year + " has 30 days"); break;
  case 5: System.out.println(
  "May " + year + " has 31 days"); break;
  case 6: System.out.println(
  "June " + year + " has 30 days"); break;
  case 7: System.out.println(
  "July " + year + " has 31 days"); break;
  case 8: System.out.println(
  "August " + year + " has 31 days"); break;
  case 9: System.out.println(
  "September " + year + " has 30 days"); break;
  case 10: System.out.println(
  "October " + year + " has 31 days"); break;
  case 11: System.out.println(
  "November " + year + " has 30 days"); break;
  case 12: System.out.println(
  "December " + year + " has 31 days");
  }
  }
  }