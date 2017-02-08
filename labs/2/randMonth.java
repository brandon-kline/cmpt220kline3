  /**
  * file: randMonth.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 7, 2017
  * version: 1.0
  * 
  */
  
 /**
  * randMonth
  * 
  * This class allows for the random generation
  * of a month of the year using integers.
  */
  
  public class secondary {
  public static void main(String[] args) {
  int mon = (int)(((Math.random())*12)+1);
  if (mon == 1)
  System.out.print("January"); 
  if (mon == 2)
  System.out.print("February");
  if (mon == 3)
  System.out.print("March"); 
  if (mon == 4)
  System.out.print("April");
  if (mon == 5)
  System.out.print("May"); 
  if (mon == 6)
  System.out.print("June");
  if (mon == 7)
  System.out.print("July"); 
  if (mon == 8)
  System.out.print("August"); 
  if (mon == 9)
  System.out.print("September");
  if (mon == 10) 
  System.out.print("October");
  if (mon == 11)
  System.out.print("November");
  if (mon == 12)
  System.out.print("December");
  }
  }