/**
  * file: plateNumbers.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 2
  * due date: Febuary 14, 2017
  * version: 1.0
  * 
  */
  
 /**
  * plateNumbers
  * 
  * This class allows for the creation of a 
  * random seven digit license plate number
  * consisting of three letters and four 
  * numbers.
  */
  
  public class plateNumbers {
  public static void main(String[] args) {
  int upletter1 = 
  65 + (int)(Math.random() * (90 - 65));
  int upletter2 =
  65 + (int)(Math.random() * (90 - 65));
  int upletter3 =
  65 + (int)(Math.random() * (90 - 65));
  int num1 = (int)(Math.random() * 10);
  int num2 = (int)(Math.random() * 10);
  int num3 = (int)(Math.random() * 10);
  int num4 = (int)(Math.random() * 10);
  System.out.println("" + (char)(upletter1) +
  (char)(upletter2) + 
  (char)(upletter3) + num1 +num2 + num3 + num4);
  }
  }