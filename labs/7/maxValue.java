/**
  * file: maxValue.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1.0
  * 
  */

/**
  * maxValue
  * 
  * This class allows for the finding of the
  * first ten square numbers larger than 
  * Long.MAX_VALUE.
  */

import java.math.BigInteger;
public class maxValue {
  public static void main(String[] args) {
    BigInteger i = new BigInteger(Long.MAX_VALUE + ""); 
    BigInteger end = i.add(new BigInteger("10"));
    for (i = new BigInteger(Long.MAX_VALUE + ""); 
    i.compareTo(end) <= 0; 
    i = i.add(new BigInteger("1"))) {
      System.out.println(i.multiply(i)); 
      }		
    }
  }