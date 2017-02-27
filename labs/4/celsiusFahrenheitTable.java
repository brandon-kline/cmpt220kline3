/**
  * file: celsiusFahrenheitTable.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 4
  * due date: Febuary 28, 2017
  * version: 1.0
  * 
  */
  
 /**
  * celsiusFahrenheitTable
  * 
  * This class allows for the system to display the table of
  * Celsius and Fahrenheit values and the values within that 
  * table.
  */

public class CelsiusFahrenheitTable {
  public static void main(String[] args) {
    System.out.println(
    "Celsius     Fahrenheit     |     Fahrenheit     Celsius\n" + 
    "---------------------------------------------------------");
    for(double cel = 40.0, fah = 120.0;
    cel >= 31.0; cel--, fah -= 10) {
    System.out.printf("%-12.1f", cel);
    System.out.printf("%-15.1f|", celtofah(cel));
    System.out.printf("     %-15.1f", fah);
    System.out.printf("%-7.2f\n\n", fahtocel(fah));
    }
  }
  
   /**
  * celtofah
  * 
  * This class allows for the system to convert values from
  * Celsius to Fahrenheit.
  */
  
public static double celtofah(double cel) {
  return (9.0 / 5) * cel +32;
  }
  
   /**
  * fahtocel
  * 
  * This class allows for the system to convert values from
  * Fahrenheit to Celsius.
  */
  
public static double fahtocel(double fah) {
  return (5.0 / 9) * (fah -32);
  }
}